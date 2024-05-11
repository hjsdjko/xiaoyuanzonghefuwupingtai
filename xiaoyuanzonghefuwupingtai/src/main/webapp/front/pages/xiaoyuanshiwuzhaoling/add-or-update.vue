
<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">失物编号</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiaoyuanshiwuzhaolingUuidNumber" type="text" v-model="ruleForm.xiaoyuanshiwuzhaolingUuidNumber" placeholder="失物编号"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">物品名称</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiaoyuanshiwuzhaolingName" type="text" v-model="ruleForm.xiaoyuanshiwuzhaolingName" placeholder="物品名称"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                          class="title">物品类型</view>
                    <picker @change="shiwuzhaolingTypesChange" :value="shiwuzhaolingTypesIndex" :range="shiwuzhaolingTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.shiwuzhaolingTypes?ruleForm.shiwuzhaolingValue:"请选择物品类型"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                          class="title">物品状态</view>
                    <picker @change="statusTypesChange" :value="statusTypesIndex" :range="statusTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.statusTypes?ruleForm.statusValue:"请选择物品状态"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="xiaoyuanshiwuzhaolingPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                          class="title">物品图片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.xiaoyuanshiwuzhaolingPhoto" :src="ruleForm.xiaoyuanshiwuzhaolingPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">拾遗时间</view>
                <input
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                        v-model="ruleForm.xiaoyuanshiwuzhaolingTime" placeholder="拾遗时间" :readonly="ro.xiaoyuanshiwuzhaolingTime"
                        @tap="toggleTab('xiaoyuanshiwuzhaolingTime')"></input>
            </view>
					            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">拾遗地址</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.xiaoyuanshiwuzhaolingDizhi" type="text" v-model="ruleForm.xiaoyuanshiwuzhaolingDizhi" placeholder="拾遗地址"></input>
            </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#FE8010","textAlign":"left"}'
                      class="title">详情</view>
                <textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#FE8010","borderRadius":"0px","color":"#FE8010","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.xiaoyuanshiwuzhaolingContent" v-model="ruleForm.xiaoyuanshiwuzhaolingContent" placeholder="详情"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#FE8010","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="xiaoyuanshiwuzhaolingTimeConfirm"
                              ref="xiaoyuanshiwuzhaolingTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					xiaoyuanshiwuzhaolingUuidNumber: true,
					xiaoyuanshiwuzhaolingName: false,
					shiwuzhaolingTypes: false,
					statusTypes: false,
					yonghuId: false,
					xiaoyuanshiwuzhaolingPhoto: false,
					xiaoyuanshiwuzhaolingTime: false,
					xiaoyuanshiwuzhaolingDizhi: false,
					xiaoyuanshiwuzhaolingContent: false,
					createTime: false,
        },
            ruleForm: {
					xiaoyuanshiwuzhaolingUuidNumber: this.getUUID(),//数字
					xiaoyuanshiwuzhaolingName: '',
					shiwuzhaolingTypes: '',//数字
					shiwuzhaolingValue: '',//数字对应的值
					statusTypes: '',//数字
					statusValue: '',//数字对应的值
					yonghuId: '',
					xiaoyuanshiwuzhaolingPhoto: '',
					xiaoyuanshiwuzhaolingTime: '',
					xiaoyuanshiwuzhaolingDizhi: '',
					xiaoyuanshiwuzhaolingContent: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				shiwuzhaolingTypesOptions: [],
							shiwuzhaolingTypesIndex : 0,
				statusTypesOptions: [],
							statusTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let shiwuzhaolingTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'shiwuzhaoling_types',
            }
			let shiwuzhaolingTypes = await this.$api.page(`dictionary`, shiwuzhaolingTypesParams);
			this.shiwuzhaolingTypesOptions = shiwuzhaolingTypes.data.list
		/*下拉框*/
			let statusTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'status_types',
            }
			let statusTypes = await this.$api.page(`dictionary`, statusTypesParams);
			this.statusTypesOptions = statusTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`xiaoyuanshiwuzhaoling`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.xiaoyuanshiwuzhaolingId){
                this.ruleForm.xiaoyuanshiwuzhaolingId = options.xiaoyuanshiwuzhaolingId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            shiwuzhaolingTypesChange(e) {
                this.shiwuzhaolingTypesIndex = e.target.value
                this.ruleForm.shiwuzhaolingValue = this.shiwuzhaolingTypesOptions[this.shiwuzhaolingTypesIndex].indexName
                this.ruleForm.shiwuzhaolingTypes = this.shiwuzhaolingTypesOptions[this.shiwuzhaolingTypesIndex].codeIndex
            },
            statusTypesChange(e) {
                this.statusTypesIndex = e.target.value
                this.ruleForm.statusValue = this.statusTypesOptions[this.statusTypesIndex].indexName
                this.ruleForm.statusTypes = this.statusTypesOptions[this.statusTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			xiaoyuanshiwuzhaolingPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.xiaoyuanshiwuzhaolingPhoto = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			xiaoyuanshiwuzhaolingTimeConfirm(val) {
                console.log(val)
                this.ruleForm.xiaoyuanshiwuzhaolingTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.xiaoyuanshiwuzhaolingUuidNumber)) {
                    this.$utils.msg(`失物编号不能为空`);
                    return
                }
				if ((!this.ruleForm.xiaoyuanshiwuzhaolingName)) {
                    this.$utils.msg(`物品名称不能为空`);
                    return
                }
				if ((!this.ruleForm.shiwuzhaolingTypes)) {
                    this.$utils.msg(`物品类型不能为空`);
                    return
                }
				if ((!this.ruleForm.statusTypes)) {
                    this.$utils.msg(`物品状态不能为空`);
                    return
                }
				if ((!this.ruleForm.xiaoyuanshiwuzhaolingPhoto)) {
                    this.$utils.msg(`物品图片不能为空`);
                    return
                }
				if ((!this.ruleForm.xiaoyuanshiwuzhaolingTime)) {
                    this.$utils.msg(`拾遗时间不能为空`);
                    return
                }
				if ((!this.ruleForm.xiaoyuanshiwuzhaolingDizhi)) {
                    this.$utils.msg(`拾遗地址不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`xiaoyuanshiwuzhaoling`, this.ruleForm);
                } else {
                    await this.$api.save(`xiaoyuanshiwuzhaoling`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>

<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>