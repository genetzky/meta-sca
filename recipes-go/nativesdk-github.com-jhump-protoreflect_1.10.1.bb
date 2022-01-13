SUMMARY = "go.mod: github.com/jhump/protoreflect"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/protoreflect"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-protoreflect-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/jhump/protoreflect"
inherit gosrc
inherit nativesdk
