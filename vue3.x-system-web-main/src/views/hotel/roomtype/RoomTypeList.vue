<template>
    <el-card>
        <template #header>
            <div class="card-header">
                <h3>
                    <el-icon style="margin-right: 10px;"><Memo/></el-icon>
                    房间类型管理
                </h3>

                <div class="card-search">
                    <el-row :gutter="10">
                        <el-col :span="7">
                            <el-input v-model="searchValue" :prefix-icon="Search" @keyup.enter.native="search" placeholder="关键字搜索"/>
                        </el-col>
                        <el-col :span="9">
                            <div class="my-button">
                                <el-button plain style="width:100%" color="#2fa7b6" @click="addRoomType">添加房间类型</el-button>
                                <el-button style="width: 100%;" @click="exportExcelAction" type="primary">
                                    <el-icon style="margin-right: 1px;"><Download/></el-icon> 
                                    导出excel</el-button>
                            </div>
                        </el-col>
                        <el-col :span="8" style="display: inline-flex; justify-content: center; align-items: center; cursor: pointer;"> 
                            <el-icon style="font-size: 20px; color=#b3b6bc;" @click="refresh"></el-icon>
                        </el-col>
                   </el-row>
                </div>
            </div>
        </template>
        <div class="table-box">
            <el-table element-loading-text="数据加载中" v-loading="loading" :data="tableData"
            style="width: 100%; text-align: center;" :cell-style="{textAlign:'center'}"
            :header-cell-style="{fontSize:'15px',background:'#083a6d',color:'white',textAlign:'center'}">

            <el-table-colum lable="序号" width="100" type="index" :index="Nindex"></el-table-colum>
            <el-table-colum lable="房间类型名称"><template #default="scope"><span>{{ scope.row.typeName }}</span></template></el-table-colum>
            <el-table-colum lable="房间类型排序"><template #default="scope"><span>{{ scope.row.typeSort }}</span></template></el-table-colum>
            <el-table-colum lable="创建时间"><template #default="scope"><span>{{ formatTime(scope.row.createTime,'yyy-MM-dd' )}}</span></template></el-table-colum>
            <el-table-colum lable="操作">
                <template #default="scope">
                    <el-button size="small" @click="editRoomType(scope.row.id)">编辑</el-button>
                    <el-popconfirm cancel-button-text="确定" cancel-button-type="取消" :icon="Delete"
                    icon-color="#626AEF" :title="确定要删除该房间类型吗" @confirm="delRoomType(scope.row.id)">
                        <template #reference>
                            <el-button size="small" type="danger">删除</el-button>
                        </template>
                    </el-popconfirm>
                </template>

        
            </el-table-colum>
        </el-table>
        </div>
    </el-card>

</template>
<script >
import { formatTime } from '@/utils/date';
export default{
    name : "RoomTypeList"
}
</script>
<style scoped>
.card-header{
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.card-header h3{
    display: inline-flex;
    justify-content: center;
    align-items: center;
}
:deep(.el-card__header){
    /* border-bottom: 1px solid rgb(238 238 238); */
    color: #083a6d;
}
.my-button{
    display: flex;
    justify-content: space-between;
}
</style>