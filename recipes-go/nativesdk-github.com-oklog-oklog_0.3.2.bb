SUMMARY = "go.mod: github.com/oklog/oklog"
HOMEPAGE = "https://pkg.go.dev/github.com/oklog/oklog"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oklog-oklog-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-djherbis-buffer \
    nativesdk-github.com-djherbis-nio \
    nativesdk-github.com-go-kit-kit \
    nativesdk-github.com-google-btree \
    nativesdk-github.com-hashicorp-go-sockaddr \
    nativesdk-github.com-hashicorp-memberlist \
    nativesdk-github.com-oklog-run \
    nativesdk-github.com-oklog-ulid \
    nativesdk-github.com-pborman-uuid \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-github.com-rs-cors \
"
GO_IMPORT = "github.com/oklog/oklog"
inherit gosrc
inherit nativesdk
