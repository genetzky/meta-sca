SUMMARY = "go.mod: github.com/lightstep/lightstep-tracer-common/golang/gogo"
HOMEPAGE = "https://pkg.go.dev/github.com/lightstep/lightstep-tracer-common/golang/gogo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-gogo-protobuf \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "github.com/lightstep/lightstep-tracer-common/golang/gogo"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"
inherit gosrc
inherit nativesdk
