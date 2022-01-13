SUMMARY = "SCA tools packaged for nativesdk"

inherit sca-global packagegroup nativesdk

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} += "\
    ${@oe.utils.ifelse('alexkohler' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-alexkohler nativesdk-sca-recipe-alexkohler-rules', '')} \
    ${@oe.utils.ifelse('bandit' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-bandit nativesdk-sca-recipe-bandit-rules', '')} \
    ${@oe.utils.ifelse('bashate' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-bashate nativesdk-sca-recipe-bashate-rules', '')} \
    ${@oe.utils.ifelse('checkbashism' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-checkbashism nativesdk-sca-recipe-checkbashism-rules', '')} \
    ${@oe.utils.ifelse('clang' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-clang nativesdk-sca-recipe-clang-rules nativesdk-clang-sca', '')} \
    ${@oe.utils.ifelse('cmake' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-sca-recipe-cmake-rules nativesdk-cmake-sca', '')} \
    ${@oe.utils.ifelse('cppcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cppcheck nativesdk-sca-recipe-cppcheck-rules', '')} \
    ${@oe.utils.ifelse('cpplint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cpplint nativesdk-sca-recipe-cpplint-rules', '')} \
    ${@oe.utils.ifelse('cspell' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cspell nativesdk-sca-recipe-cspell-rules nativesdk-cspell-user-dict', '')} \
    ${@oe.utils.ifelse('cvecheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-cvecheck-sca', '')} \
    ${@oe.utils.ifelse('darglint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-darglint nativesdk-sca-recipe-darglint-rules', '')} \
    ${@oe.utils.ifelse('dennis' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-dennis nativesdk-sca-recipe-dennis-rules', '')} \
    ${@oe.utils.ifelse('detectsecrets' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-detect-secrets nativesdk-sca-recipe-detectsecrets-rules', '')} \
    ${@oe.utils.ifelse('eslint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-eslint nativesdk-sca-recipe-eslint-rules', '')} \
    ${@oe.utils.ifelse('flake8' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-flake8-sca nativesdk-sca-recipe-flake8-rules', '')} \
    ${@oe.utils.ifelse('flawfinder' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-flawfinder nativesdk-sca-recipe-flawfinder-rules', '')} \
    ${@oe.utils.ifelse('flint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-flint++ nativesdk-sca-recipe-flint-rules', '')} \
    ${@oe.utils.ifelse('gcc' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-sca-recipe-gcc-rules nativesdk-gcc-sca', '')} \
    ${@oe.utils.ifelse('goconsistent' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-goconsistent-sca nativesdk-sca-recipe-goconsistent-rules', '')} \
    ${@oe.utils.ifelse('goconst' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-goconst-sca nativesdk-sca-recipe-goconst-rules', '')} \
    ${@oe.utils.ifelse('golint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-golint-sca nativesdk-sca-recipe-golint-rules', '')} \
    ${@oe.utils.ifelse('gosec' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-gosec-sca nativesdk-sca-recipe-gosec-rules', '')} \
    ${@oe.utils.ifelse('htmlhint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-htmlhint nativesdk-sca-recipe-htmlhint-rules', '')} \
    ${@oe.utils.ifelse('it' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-it nativesdk-sca-recipe-it-rules', '')} \
    ${@oe.utils.ifelse('jshint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-jshint nativesdk-sca-recipe-jshint-rules', '')} \
    ${@oe.utils.ifelse('jsonlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-jsonlint-sca nativesdk-sca-recipe-jsonlint-rules', '')} \
    ${@oe.utils.ifelse('kconfighard' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-kconfig-hardened-check nativesdk-sca-recipe-kconfighard-rules', '')} \
    ${@oe.utils.ifelse('looong' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-looong nativesdk-sca-recipe-looong-rules', '')} \
    ${@oe.utils.ifelse('luacheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-luacheck nativesdk-sca-recipe-luacheck-rules', '')} \
    ${@oe.utils.ifelse('msgcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-msgcheck nativesdk-sca-recipe-msgcheck-rules', '')} \
    ${@oe.utils.ifelse('multimetric' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-multimetric nativesdk-sca-recipe-multimetric-rules', '')} \
    ${@oe.utils.ifelse('mypy' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-mypy nativesdk-sca-recipe-mypy-rules', '')} \
    ${@oe.utils.ifelse('npmaudit' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-npmaudit-sca nativesdk-sca-recipe-npmaudit-rules', '')} \
    ${@oe.utils.ifelse('perl' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-perl-sca nativesdk-sca-recipe-perl-rules', '')} \
    ${@oe.utils.ifelse('perlcritic' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-perl-critic nativesdk-sca-recipe-perlcritic-rules', '')} \
    ${@oe.utils.ifelse('phan' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phan nativesdk-sca-recipe-phan-rules', '')} \
    ${@oe.utils.ifelse('phpcodefixer' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phpcodefixer nativesdk-sca-recipe-phpcodefixer-rules', '')} \
    ${@oe.utils.ifelse('phpcodesniffer' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phpcodesniffer nativesdk-sca-recipe-phpcodesniffer-rules', '')} \
    ${@oe.utils.ifelse('phpmd' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phpmd nativesdk-sca-recipe-phpmd-rules', '')} \
    ${@oe.utils.ifelse('phpsecaudit' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phpcs-security-audit nativesdk-sca-recipe-phpsecaudit-rules', '')} \
    ${@oe.utils.ifelse('phpstan' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-phpstan nativesdk-sca-recipe-phpstan-rules', '')} \
    ${@oe.utils.ifelse('progpilot' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-progpilot nativesdk-sca-recipe-progpilot-rules', '')} \
    ${@oe.utils.ifelse('proselint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-proselint nativesdk-sca-recipe-proselint-rules', '')} \
    ${@oe.utils.ifelse('protolint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-protolint-sca nativesdk-sca-recipe-protolint-rules', '')} \
    ${@oe.utils.ifelse('pscan' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-pscan nativesdk-sca-recipe-pscan-rules', '')} \
    ${@oe.utils.ifelse('pyfindinjection' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-pyfindinjection nativesdk-sca-recipe-pyfindinjection-rules', '')} \
    ${@oe.utils.ifelse('pylint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-pylint nativesdk-sca-recipe-pylint-rules', '')} \
    ${@oe.utils.ifelse('pyright' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-pyright nativesdk-sca-recipe-pyright-rules', '')} \
    ${@oe.utils.ifelse('pysymbolcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-pysymbolcheck nativesdk-sca-recipe-pysymcheck-rules', '')} \
    ${@oe.utils.ifelse('rats' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-rats nativesdk-sca-recipe-rats-rules', '')} \
    ${@oe.utils.ifelse('reek' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-reek-sca nativesdk-sca-recipe-reek-rules', '')} \
    ${@oe.utils.ifelse('retire' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-retire nativesdk-sca-recipe-retire-rules', '')} \
    ${@oe.utils.ifelse('revive' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-revive-sca nativesdk-sca-recipe-revive-rules', '')} \
    ${@oe.utils.ifelse('ropgadget' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-ropgadget ', '')} \
    ${@oe.utils.ifelse('rubycritic' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-rubycritic-sca nativesdk-sca-recipe-rubycritic-rules', '')} \
    ${@oe.utils.ifelse('safety' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-safety nativesdk-python3-setuptools nativesdk-sca-recipe-safety-rules', '')} \
    ${@oe.utils.ifelse('secretlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-secretlint-sca nativesdk-sca-recipe-secretlint-rules', '')} \
    ${@oe.utils.ifelse('setuptoolslint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-setuptools-lint nativesdk-python3-setuptools nativesdk-sca-recipe-setuptoolslint-rules', '')} \
    ${@oe.utils.ifelse('shellcheck' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-shellcheck nativesdk-sca-recipe-shellcheck-rules', '')} \
    ${@oe.utils.ifelse('slick' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-slick-sca nativesdk-sca-recipe-slick-rules', '')} \
    ${@oe.utils.ifelse('sparse' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-sparse nativesdk-sca-recipe-sparse-rules', '')} \
    ${@oe.utils.ifelse('standard' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-standard nativesdk-sca-recipe-standard-rules', '')} \
    ${@oe.utils.ifelse('stank' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-stank-sca nativesdk-sca-recipe-stank-rules', '')} \
    ${@oe.utils.ifelse('stylelint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-stylelint nativesdk-sca-recipe-stylelint-rules', '')} \
    ${@oe.utils.ifelse('systemdlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-systemdlint nativesdk-sca-recipe-systemdlint-rules', '')} \
    ${@oe.utils.ifelse('textlint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-textlint nativesdk-sca-recipe-textlint-rules', '')} \
    ${@oe.utils.ifelse('tlv' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-tlv', '')} \
    ${@oe.utils.ifelse('tscancode' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-tscancode nativesdk-sca-recipe-tscancode-rules', '')} \
    ${@oe.utils.ifelse('vulture' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-vulture nativesdk-sca-recipe-vulture-rules', '')} \
    ${@oe.utils.ifelse('wotan' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-wotan nativesdk-sca-recipe-wotan-rules', '')} \
    ${@oe.utils.ifelse('xmllint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-xmllint-sca nativesdk-sca-recipe-xmllint-rules', '')} \
    ${@oe.utils.ifelse('yamllint' in (d.getVar('SCA_AVAILABLE_MODULES') or '').split(' '), 'nativesdk-python3-yamllint nativesdk-sca-recipe-yamllint-rules', '')} \
    nativesdk-sca-runall \
"
