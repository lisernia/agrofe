package ar.com.agromayor.portal.db;

// Generated Jan 7, 2010 2:27:48 AM by Hibernate Tools 3.2.4.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FacturaCabecera generated by hbm2java
 */
@Entity
@Table(name = "FACTURA_CABECERA")
public class FacturaCabecera implements java.io.Serializable {
	private static final long serialVersionUID = 7654143418805054090L;
	
	private long cabNroInterno;

	private Integer recCodigo;
	private Short recSubcuenta;

	private Date cabFechaCpr;

	private String cabLetra;
	private Short cabSucursal;
	private Integer cabCprNumero;
	private String cabTipoCpr;
	private int factPdf;
	private String factPdfRuta;

	public FacturaCabecera() {
	}

	public FacturaCabecera(long cabNroInterno) {
		this.cabNroInterno = cabNroInterno;
	}

	public FacturaCabecera(long cabNroInterno, Integer recCodigo, Short recSubcuenta,
                          Date cabFechaCpr, String cabLetra, Short cabSucursal, Integer cabCprNumero,
                          String cabTipoCpr, int factPdf, String factPdfRuta) {
		this.cabNroInterno = cabNroInterno;
		this.recCodigo = recCodigo;
		this.recSubcuenta = recSubcuenta;
		this.cabFechaCpr = cabFechaCpr;
		this.cabLetra = cabLetra;
		this.cabSucursal = cabSucursal;
		this.cabCprNumero = cabCprNumero;
		this.cabTipoCpr = cabTipoCpr;
		this.factPdf = factPdf;
		this.factPdfRuta = factPdfRuta;
	}

	@Id
	@Column(name = "CAB_NRO_INTERNO", unique = true, nullable = false, precision = 10, scale = 0)
	public long getCabNroInterno() {
		return this.cabNroInterno;
	}

	public void setCabNroInterno(long cabNroInterno) {
		this.cabNroInterno = cabNroInterno;
	}

	@Column(name = "REC_CODIGO", precision = 8, scale = 0)
	public Integer getRecCodigo() {
		return this.recCodigo;
	}

	public void setRecCodigo(Integer recCodigo) {
		this.recCodigo = recCodigo;
	}

	@Column(name = "REC_SUBCUENTA", precision = 3, scale = 0)
	public Short getRecSubcuenta() {
		return this.recSubcuenta;
	}

	public void setRecSubcuenta(Short recSubcuenta) {
		this.recSubcuenta = recSubcuenta;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CAB_FECHA_CPR", length = 7)
	public Date getCabFechaCpr() {
		return this.cabFechaCpr;
	}

	public void setCabFechaCpr(Date cabFechaCpr) {
		this.cabFechaCpr = cabFechaCpr;
	}

	@Column(name = "CAB_LETRA", length = 1)
	public String getCabLetra() {
		return this.cabLetra;
	}

	public void setCabLetra(String cabLetra) {
		this.cabLetra = cabLetra;
	}

	@Column(name = "CAB_SUCURSAL", precision = 4, scale = 0)
	public Short getCabSucursal() {
		return this.cabSucursal;
	}

	public void setCabSucursal(Short cabSucursal) {
		this.cabSucursal = cabSucursal;
	}

	@Column(name = "CAB_CPR_NUMERO", precision = 8, scale = 0)
	public Integer getCabCprNumero() {
		return this.cabCprNumero;
	}

	public void setCabCprNumero(Integer cabCprNumero) {
		this.cabCprNumero = cabCprNumero;
	}

	@Column(name = "CAB_TIPO_CPR", length = 2)
	public String getCabTipoCpr() {
		return this.cabTipoCpr;
	}

	public void setCabTipoCpr(String cabTipoCpr) {
		this.cabTipoCpr = cabTipoCpr;
	}

	@Column(name = "FACT_PDF", nullable = false, precision = 1, scale = 0)
	public int isFactPdf() {
		return this.factPdf;
	}

	public void setFactPdf(int factPdf) {
		this.factPdf = factPdf;
	}

	@Column(name = "FACT_PDF_RUTA", length = 500)
	public String getFactPdfRuta() {
		return this.factPdfRuta;
	}

	public void setFactPdfRuta(String factPdfRuta) {
		this.factPdfRuta = factPdfRuta;
	}


}
