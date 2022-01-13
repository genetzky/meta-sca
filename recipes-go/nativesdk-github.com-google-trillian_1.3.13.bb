SUMMARY = "go.mod: github.com/google/trillian"
HOMEPAGE = "https://pkg.go.dev/github.com/google/trillian"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-trillian-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-bitbucket.org-creachadair-shell \
    nativesdk-cloud.google.com-go-spanner \
    nativesdk-contrib.go.opencensus.io-exporter-stackdriver \
    nativesdk-github.com-apache-beam \
    nativesdk-github.com-fullstorydev-grpcurl \
    nativesdk-github.com-go-redis-redis \
    nativesdk-github.com-go-sql-driver-mysql \
    nativesdk-github.com-golang-glog \
    nativesdk-github.com-golang-mock \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-google-btree \
    nativesdk-github.com-google-certificate-transparency-go \
    nativesdk-github.com-google-go-cmp \
    nativesdk-github.com-grpc-ecosystem-go-grpc-middleware \
    nativesdk-github.com-letsencrypt-pkcs11key-v4 \
    nativesdk-github.com-lib-pq \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-github.com-prometheus-client-model \
    nativesdk-github.com-pseudomuto-protoc-gen-doc \
    nativesdk-go.etcd.io-etcd \
    nativesdk-go.opencensus.io \
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
    nativesdk-google.golang.org-api \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/google/trillian"
# who ever made that weird mix of test/internal and cross reference should get fired
# version is simply not compilable
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
