const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanzonghefuwupingtai/",
            name: "xiaoyuanzonghefuwupingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanzonghefuwupingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园综合服务平台"
        } 
    }
}
export default base
