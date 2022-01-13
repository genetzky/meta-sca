SUMMARY = "go.mod: github.com/google/certificate-transparency-go"
HOMEPAGE = "https://pkg.go.dev/github.com/google/certificate-transparency-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-certificate-transparency-go-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-glog \
    nativesdk-github.com-golang-mock \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-trillian \
    nativesdk-github.com-juju-ratelimit \
    nativesdk-github.com-kylelemons-godebug \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-github.com-rs-cors \
    nativesdk-github.com-sergi-go-diff \
    nativesdk-github.com-tomasen-realip \
    nativesdk-go.etcd.io-etcd \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-net \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/google/certificate-transparency-go"
# trillian integration is completely broken
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
