SUMMARY = "go.mod: sourcegraph.com/sourcegraph/appdash"
HOMEPAGE = "https://pkg.go.dev/sourcegraph.com/sourcegraph/appdash"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require sourcegraph.com-sourcegraph-appdash-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gogo-protobuf \
    nativesdk-github.com-gorilla-mux \
    nativesdk-github.com-jessevdk-go-flags \
    nativesdk-github.com-opentracing-basictracer-go \
    nativesdk-github.com-opentracing-opentracing-go \
    nativesdk-github.com-urfave-negroni \
    nativesdk-sourcegraph.com-sourcegraph-appdash-data \
"
GO_IMPORT = "sourcegraph.com/sourcegraph/appdash"
inherit gosrc
inherit nativesdk
