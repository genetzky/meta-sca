SUMMARY = "go.mod: github.com/lightstep/lightstep-tracer-go"
HOMEPAGE = "https://pkg.go.dev/github.com/lightstep/lightstep-tracer-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lightstep-lightstep-tracer-go-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gogo-protobuf \
    nativesdk-github.com-lightstep-lightstep-tracer-common-golang-gogo \
    nativesdk-github.com-opentracing-opentracing-go \
    nativesdk-github.com-shirou-gopsutil-v3 \
    nativesdk-go.opencensus.io \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "github.com/lightstep/lightstep-tracer-go"
inherit gosrc
inherit nativesdk
