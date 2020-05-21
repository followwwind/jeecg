package com.jeecg.zrdwxx.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
  转入单位信息
 */
@Entity
@Table(name = "zrdwxx", schema = "")
@SuppressWarnings("serial")
public class ZrdwxxEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**转入单位编号*/
	@Excel(name="转入单位编号",width=15,dicCode="bpm_status")
	private java.lang.String zrdwbh;
	/**单位名称*/
	@Excel(name="单位名称",width=15)
	private java.lang.String dwmc;
	/**单位类型*/
	@Excel(name="单位类型",width=15)
	private java.lang.String dwlx;
	/**变更日期*/
	@Excel(name="变更日期",width=15,format = "yyyy-MM-dd")
	private java.util.Date bgrq;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转入单位编号
	 */

	@Column(name ="ZRDWBH",nullable=true,length=32)
	public java.lang.String getZrdwbh(){
		return this.zrdwbh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转入单位编号
	 */
	public void setZrdwbh(java.lang.String zrdwbh){
		this.zrdwbh = zrdwbh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位名称
	 */

	@Column(name ="DWMC",nullable=true,length=50)
	public java.lang.String getDwmc(){
		return this.dwmc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位名称
	 */
	public void setDwmc(java.lang.String dwmc){
		this.dwmc = dwmc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  单位类型
	 */

	@Column(name ="DWLX",nullable=true,length=50)
	public java.lang.String getDwlx(){
		return this.dwlx;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  单位类型
	 */
	public void setDwlx(java.lang.String dwlx){
		this.dwlx = dwlx;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  变更日期
	 */

	@Column(name ="BGRQ",nullable=true,length=50)
	public java.util.Date getBgrq(){
		return this.bgrq;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  变更日期
	 */
	public void setBgrq(java.util.Date bgrq){
		this.bgrq = bgrq;
	}
}
