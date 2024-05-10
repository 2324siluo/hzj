import request from '@/utils/request'

// 查询科研标准列表
export function listStandard(query) {
  return request({
    url: '/test/standard/list',
    method: 'get',
    params: query
  })
}

// 查询科研标准详细
export function getStandard(sssId) {
  return request({
    url: '/test/standard/' + sssId,
    method: 'get'
  })
}

// 新增科研标准
export function addStandard(data) {
  return request({
    url: '/test/standard',
    method: 'post',
    data: data
  })
}

// 修改科研标准
export function updateStandard(data) {
  return request({
    url: '/test/standard',
    method: 'put',
    data: data
  })
}

// 删除科研标准
export function delStandard(sssId) {
  return request({
    url: '/test/standard/' + sssId,
    method: 'delete'
  })
}
