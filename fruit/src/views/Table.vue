<template>
    <el-table
            :data="tableData"
            border
            style="width: 100%">
        <el-table-column
                fixed
                prop="id"
                label="编号"
                width="160">
        </el-table-column>
        <el-table-column
                prop="name"
                label="名称"
                width="160">
        </el-table-column>
        <el-table-column
                prop="sale"
                label="销量"
                width="160">
        </el-table-column>
        <el-table-column
                prop="icon"
                label="图标"
                width="160">
            <template slot-scope="scope">
                <img :src="scope.row.icon" style="height: 70px"/>
            </template>
        </el-table-column>

        <el-table-column

                label="操作"
                width="100">
            <template slot-scope="scope">
                <el-button @click="fruitDel(scope.row)" type="text" size="small">删除</el-button>
                <el-button @click="fruitFind(scope.row)" type="text" size="small">编辑</el-button>
            </template>
        </el-table-column>
    </el-table>
</template>

<script>
    export default {
        methods: {
            fruitFind(row){
                this.$router.push('/edit?id='+row.id)
            },
            fruitDel(row) {
                console.log(row);
                // alert(row.id)
                const _this = this
                // axios.delete("http://localhost:8181/fruit/deleteById/"+row.id).then(function (resp) {
                    // if(resp.data){
                    //     _this.$message({
                    //         message: 'warning',
                    //         type: 'warning'
                    //     });
                    // }
                    _this.$confirm('是否要删除'+row.name, '删除数据', {

                        confirmButtonText: '确定',
                        cancelButtonText: '取消',
                        type:'warning'
                    })
                        .then(() => {
                            axios.delete("http://localhost:8181/fruit/deleteById/"+row.id).then(function (resp){
                                if(resp.data){
                                    _this.$alert(row.name+'删除成功',{
                                        confirmButtonText: '确定',
                                        callback:action=>{
                                            //刷新页面
                                            location.reload()
                                        }
                                    })
                                }
                            })
                        })
                        .catch(action => {

                        });
                // })
            }
        },
        created(){
            const _this = this
            axios.get("http://localhost:8181/fruit/list").then(function (resp) {
                _this.tableData = resp.data
            })
        },
        data() {
            return {
                tableData: [{
                    id: '2016-05-02',
                    name: '王小虎',
                    sale: '上海',
                    icon: '普陀区',
                    address: '上海市普陀区金沙江路 1518 弄',
                    zip: 200333
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1517 弄',
                    zip: 200333
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1519 弄',
                    zip: 200333
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    province: '上海',
                    city: '普陀区',
                    address: '上海市普陀区金沙江路 1516 弄',
                    zip: 200333
                }]
            }
        }
    }
</script>