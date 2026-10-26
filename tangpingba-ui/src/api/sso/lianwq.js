import request from '@/utils/request'

/**
 * 获取链万企免密重定向跳转信息（使用默认固定测试假数据）
 * @param {Object} query 查询参数，可选 redirectUrl
 */
export function getLianWanQiRedirectUrl(query) {
  return request({
    url: '/sso/lianwq/getRedirectUrl',
    method: 'get',
    params: query
  })
}

/**
 * 自定义参数生成链万企免密跳转信息
 * @param {Object} data 自定义载荷参数
 */
export function generateLianWanQiUrl(data) {
  return request({
    url: '/sso/lianwq/generateUrl',
    method: 'post',
    data: data
  })
}

/**
 * 获取当前后端配置与默认假数据
 */
export function getDefaultConfig() {
  return request({
    url: '/sso/lianwq/getDefaultConfig',
    method: 'get'
  })
}

/**
 * 解密密文数据验证
 * @param {Object} data { data: '...' }
 */
export function decryptCipher(data) {
  return request({
    url: '/sso/lianwq/decrypt',
    method: 'post',
    data: data
  })
}
