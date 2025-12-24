def call(String appName, String riskLevel) {
    echo "========================================================"
    echo "   NCHL - OFFICIAL AUDIT LOG"
    echo "========================================================"
    echo "   Application: ${appName}"
    echo "   Risk Level : ${riskLevel}"
    echo "   Timestamp  : ${new Date()}"
    echo "   Compliance : ENFORCED"
    echo "========================================================"
}
