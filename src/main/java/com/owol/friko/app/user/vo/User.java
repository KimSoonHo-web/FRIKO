package com.owol.friko.app.user.vo;

import java.sql.Timestamp;


public class User {
	
		private int userNo;
	    private String userEmail;
	    private Timestamp userChgDt;
	    private int userPwErrCnt;
	    private String userStc;
	    private Timestamp lstAcsDtm;
	    private Timestamp rgDtm;
	    private Timestamp lstUdDtm;
	    private Timestamp wthDtm;
	    
	    
	    public User() {
			// TODO Auto-generated constructor stub
		}


		public User(int userNo, String userEmail, Timestamp userChgDt, int userPwErrCnt, String userStc,
				Timestamp lstAcsDtm, Timestamp rgDtm, Timestamp lstUdDtm, Timestamp wthDtm) {
			super();
			this.userNo = userNo;
			this.userEmail = userEmail;
			this.userChgDt = userChgDt;
			this.userPwErrCnt = userPwErrCnt;
			this.userStc = userStc;
			this.lstAcsDtm = lstAcsDtm;
			this.rgDtm = rgDtm;
			this.lstUdDtm = lstUdDtm;
			this.wthDtm = wthDtm;
		}


		public int getUserNo() {
			return userNo;
		}


		public void setUserNo(int userNo) {
			this.userNo = userNo;
		}


		public String getUserEmail() {
			return userEmail;
		}


		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}


		public Timestamp getUserChgDt() {
			return userChgDt;
		}


		public void setUserChgDt(Timestamp userChgDt) {
			this.userChgDt = userChgDt;
		}


		public int getUserPwErrCnt() {
			return userPwErrCnt;
		}


		public void setUserPwErrCnt(int userPwErrCnt) {
			this.userPwErrCnt = userPwErrCnt;
		}


		public String getUserStc() {
			return userStc;
		}


		public void setUserStc(String userStc) {
			this.userStc = userStc;
		}


		public Timestamp getLstAcsDtm() {
			return lstAcsDtm;
		}


		public void setLstAcsDtm(Timestamp lstAcsDtm) {
			this.lstAcsDtm = lstAcsDtm;
		}


		public Timestamp getRgDtm() {
			return rgDtm;
		}


		public void setRgDtm(Timestamp rgDtm) {
			this.rgDtm = rgDtm;
		}


		public Timestamp getLstUdDtm() {
			return lstUdDtm;
		}


		public void setLstUdDtm(Timestamp lstUdDtm) {
			this.lstUdDtm = lstUdDtm;
		}


		public Timestamp getWthDtm() {
			return wthDtm;
		}


		public void setWthDtm(Timestamp wthDtm) {
			this.wthDtm = wthDtm;
		}
	    
	    
		

}
