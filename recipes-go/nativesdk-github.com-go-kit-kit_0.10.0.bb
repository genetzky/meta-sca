SUMMARY = "go.mod: github.com/go-kit/kit"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/kit"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-kit-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-afex-hystrix-go \
    nativesdk-github.com-apache-thrift \
    nativesdk-github.com-aws-aws-sdk-go \
    nativesdk-github.com-aws-aws-sdk-go-v2 \
    nativesdk-github.com-casbin-casbin-v2 \
    nativesdk-github.com-davecgh-go-spew \
    nativesdk-github.com-dgrijalva-jwt-go \
    nativesdk-github.com-go-logfmt-logfmt \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-gorilla-mux \
    nativesdk-github.com-hashicorp-consul-api \
    nativesdk-github.com-hudl-fargo \
    nativesdk-github.com-influxdata-influxdb1-client \
    nativesdk-github.com-lightstep-lightstep-tracer-go \
    nativesdk-github.com-nats-io-nats.go \
    nativesdk-github.com-oklog-oklog \
    nativesdk-github.com-opentracing-opentracing-go \
    nativesdk-github.com-openzipkin-contrib-zipkin-go-opentracing \
    nativesdk-github.com-openzipkin-zipkin-go \
    nativesdk-github.com-pborman-uuid \
    nativesdk-github.com-performancecopilot-speed \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-github.com-samuel-go-zookeeper \
    nativesdk-github.com-sirupsen-logrus \
    nativesdk-github.com-sony-gobreaker \
    nativesdk-github.com-streadway-amqp \
    nativesdk-github.com-streadway-handy \
    nativesdk-github.com-vividcortex-gohistogram \
    nativesdk-go.etcd.io-etcd \
    nativesdk-go.opencensus.io \
    nativesdk-go.uber.org-zap \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-time \
    nativesdk-golang.org-x-tools \
    nativesdk-google.golang.org-grpc \
    nativesdk-sourcegraph.com-sourcegraph-appdash \
"
GO_IMPORT = "github.com/go-kit/kit"
# version is somehow broken
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
