import request from '@/utils/request'

// 查询测试用列表
export function listTest(query) {
  return request({
    url: '/system/test/list',
    method: 'get',
    params: query
  })
}

// 查询测试用详细
export function getTest(uid) {
  return request({
    url: '/system/test/' + uid,
    method: 'get'
  })
}

// 新增测试用
export function addTest(data) {
  return request({
    url: '/system/test',
    method: 'post',
    data: data
  })
}

// 修改测试用
export function updateTest(data) {
  return request({
    url: '/system/test',
    method: 'put',
    data: data
  })
}

// 删除测试用
export function delTest(uid) {
  return request({
    url: '/system/test/' + uid,
    method: 'delete'
  })
}

// 导出测试用
export function exportTest(query) {
  return request({
    url: '/system/test/export',
    method: 'get',
    params: query
  })
}
