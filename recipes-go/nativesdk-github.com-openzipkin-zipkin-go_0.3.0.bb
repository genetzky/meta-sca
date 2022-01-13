SUMMARY = "go.mod: github.com/openzipkin/zipkin-go"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin/zipkin-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-zipkin-go-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-rabbitmq-amqp091-go \
    nativesdk-github.com-shopify-sarama \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/openzipkin/zipkin-go"
inherit gosrc
inherit nativesdk
