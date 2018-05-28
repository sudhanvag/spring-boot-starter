function() {
    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);
    var port = karate.properties['demo.server.port'];
    if (!port) {
        port = karate.env == 'web' ? 8090 : 8080;
    }
    var protocol = 'http';
    if (karate.properties['demo.server.https'] == 'true') {
        protocol = 'https';
        karate.configure('ssl', true);
    }
    var config = { baseUrl: protocol + '://localhost:' + port };

    if (karate.env == 'proxy') {
        var proxyPort = karate.properties['demo.proxy.port']
        karate.configure('proxy', 'http://127.0.0.1:' + proxyPort);
    }
    if (karate.env == 'contract') {
        config.paymentServiceUrl = karate.properties['payment.service.url'];
        config.queueName = karate.properties['shipping.queue.name'];
        if (config.paymentServiceUrl.startsWith('https')) {
            if (config.queueName == 'DEMO.CONTRACT.SSL') {
                karate.configure('ssl', { trustStore: 'classpath:server-keystore.p12', password: 'karate-mock', type: 'pkcs12' });
            } else {
                karate.configure('ssl', true);
            }
        }
    }
    return config;
}