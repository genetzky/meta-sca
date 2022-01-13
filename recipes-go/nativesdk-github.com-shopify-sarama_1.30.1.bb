SUMMARY = "go.mod: github.com/Shopify/sarama"
HOMEPAGE = "https://pkg.go.dev/github.com/Shopify/sarama"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shopify-sarama-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-davecgh-go-spew \
    nativesdk-github.com-eapache-go-resiliency \
    nativesdk-github.com-eapache-go-xerial-snappy \
    nativesdk-github.com-eapache-queue \
    nativesdk-github.com-jcmturner-gofork \
    nativesdk-github.com-jcmturner-gokrb5-v8 \
    nativesdk-github.com-klauspost-compress \
    nativesdk-github.com-pierrec-lz4 \
    nativesdk-github.com-rcrowley-go-metrics \
    nativesdk-github.com-xdg-go-scram \
    nativesdk-golang.org-x-net \
"
GO_IMPORT = "github.com/Shopify/sarama"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"
inherit gosrc
inherit nativesdk
