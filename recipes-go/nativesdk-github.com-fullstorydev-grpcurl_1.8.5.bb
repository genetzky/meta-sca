SUMMARY = "go.mod: github.com/fullstorydev/grpcurl"
HOMEPAGE = "https://pkg.go.dev/github.com/fullstorydev/grpcurl"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fullstorydev-grpcurl-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-jhump-protoreflect \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/fullstorydev/grpcurl"
inherit gosrc
inherit nativesdk
