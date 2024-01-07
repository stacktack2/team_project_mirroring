	let mid = document.frm.mid; 
	let mpw = document.frm.mpw; 
	let mpwRe = document.frm.mpwRe; 
	let mnickNm = document.frm.mnickNm;
	let mname = document.frm.mname; 
	let mbirth = document.frm.mbirth; 
	let mphone1 = document.frm.mphone1; 
	let mphone2 = document.frm.mphone2; 
	let mphone3 = document.frm.mphone3; 
	let mgender = document.frm.mgender; 
	let memail = document.frm.memail;
	let checkIdFlag = false;
	let checkNickNmFlag = false;
	
	function checkId(obj){
		let regId = /[^a-zA-Z]/g;
		let regRs = regId.test(obj.value); 
		let midTd = document.getElementById("midTd");
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			midTd.innerHTML = '아이디를 입력해주세요';
			midTd.style.color = 'red';
			return false;
		}else if(regRs){
			midTd.innerHTML = '영문만 사용가능합니다.';
			midTd.style.color = 'red';
			return false;
		}else{
			midTd.innerHTML = '사용가능합니다.';
			midTd.style.color = 'green';
			return true;
		}
	}
	
	function checkPw(obj){
		let regId = /[^0-9a-zA-Z]/g;
		let regRs = regId.test(obj.value); 
		let mpwTd = document.getElementById("mpwTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mpwTd.innerHTML = '비밀번호를 입력해주세요';
			mpwTd.style.color = 'red';
			return false;
		}else if(regRs){
			mpwTd.innerHTML ='영문과 숫자만 사용가능합니다.';
			mpwTd.style.color = 'red';
			return false;
		}else{
			mpwTd.innerHTML = '사용가능합니다.';
			mpwTd.style.color = 'green';
			return true;
		}
	}
	
	function checkPwRe(obj){
		let confirmPw = mpw.value == obj.value;
		let mpwReTd = document.getElementById("mpwReTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mpwReTd.innerHTML = '비밀번호를 입력해주세요';
			mpwReTd.style.color = 'red';
			return false;
		}else if(!confirmPw){
			mpwReTd.innerHTML = '비밀번호가 같지 않습니다.';
			mpwReTd.style.color = 'red';
			return false;
		}else{
			mpwReTd.innerHTML = '사용가능합니다.';
			mpwReTd.style.color = 'green';
			return true;
		}
	}
	
	function checkNickNm(obj){
		let regId = /[^0-9a-zA-Z가-힣]/g;
		let regRs = regId.test(obj.value); 
		let mnickNmTd = document.getElementById("mnickNmTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mnickNmTd.innerHTML = '닉네임을 입력해주세요';
			mnickNmTd.style.color = 'red';
			return false;
		}else if(regRs){
			mnickNmTd.innerHTML = '한글과 영문,숫자만 사용가능합니다.';
			mnickNmTd.style.color = 'red';
			return false;
		}else{
			mnickNmTd.innerHTML = '사용가능합니다.';
			mnickNmTd.style.color = 'green';
			return true;
		}
	}
	
	function checkName(obj){
		let regId = /[^가-힣]/g;
		let regRs = regId.test(obj.value); 
		let mnameTd = document.getElementById("mnameTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mnameTd.innerHTML = '이름을 입력해주세요';
			mnameTd.style.color = 'red';
			return false;
		}else if(regRs){
			mnameTd.innerHTML = '한글만 사용가능합니다.';
			mnameTd.style.color = 'red';
			return false;
		}else{
			mnameTd.innerHTML = '사용가능합니다.';
			mnameTd.style.color = 'green';
			return true;
		}
	}
	
	function checkBirth(obj){
		let regId = /[^0-9]/g;
		let regRs = regId.test(obj.value); 
		let mbirthTd = document.getElementById("mbirthTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mbirthTd.innerHTML = '생년월일을 입력해주세요.';
			mbirthTd.style.color = 'red';
			return false;
		}else if(regRs){
			mbirthTd.innerHTML = '숫자만 사용가능합니다.';
			mbirthTd.style.color = 'red';
			return false;
		}else{
			mbirthTd.innerHTML = '사용가능합니다.';
			mbirthTd.style.color = 'green';
			return true;
		}
	}
	
	function checkPhone1(obj){
		let regId = /[^0-9]/g;
		let regRs = regId.test(obj.value); 
		let mphoneTd = document.getElementById("mphoneTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mphoneTd.innerHTML = '전화번호를 입력해주세요.';
			mphoneTd.style.color = 'red';
			return false;
		}else if(regRs){
			mphoneTd.innerHTML = '숫자만 사용가능합니다.';
			mphoneTd.style.color = 'red';
			return false;
		}else{
			mphoneTd.innerHTML = '사용가능합니다.';
			mphoneTd.style.color = 'green';
			return true;
		}
	}
	
	function checkPhone2(obj){
		let regId = /[^0-9]/g;
		let regRs = regId.test(obj.value); 
		let mphoneTd = document.getElementById("mphoneTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mphoneTd.innerHTML = '전화번호를 입력해주세요.';
			mphoneTd.style.color = 'red';
			return false;
		}else if(regRs){
			mphoneTd.innerHTML = '숫자만 사용가능합니다.';
			mphoneTd.style.color = 'red';
			return false;
		}else{
			mphoneTd.innerHTML = '사용가능합니다.';
			mphoneTd.style.color = 'green';
			return true;
		}
	}
	
	function checkPhone3(obj){
		let regId = /[^0-9]/g;
		let regRs = regId.test(obj.value); 
		let mphoneTd = document.getElementById("mphoneTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			mphoneTd.innerHTML = '전화번호를 입력해주세요.';
			mphoneTd.style.color = 'red';
			return false;
		}else if(regRs){
			mphoneTd.innerHTML = '숫자만 사용가능합니다.';
			mphoneTd.style.color = 'red';
			return false;
		}else{
			mphoneTd.innerHTML = '사용가능합니다.';
			mphoneTd.style.color = 'green';
			return true;
		}
	}
	
	function checkGender(mgender){
		
		let mgenderTd = document.getElementById("mgenderTd"); 
		if(mgender.value == "" || mgender.value === null || mgender.value === undefined){
			mgenderTd.innerHTML = '성별을 선택해주세요.';
			mgenderTd.style.color = 'red';
			return false;
		}else{
			mgenderTd.innerHTML = '';
			return true;
		}
	}
	
	function checkEmail(obj){
		let memailTd = document.getElementById("memailTd"); 
		if(obj.value == "" || obj.value === null || obj.value === undefined){
			memailTd.innerHTML = '이메일을 입력해주세요.';
			memailTd.style.color = 'red';
			return false;
		}else{
			memailTd.innerHTML = '사용가능합니다.';
			memailTd.style.color = 'green';
			return true;
		}
	}
	
	
	
	function checkIdFn(){
		let id = document.frm.mid.value;
		
		$.ajax({
			url : "checkId.jsp",
			type : "get",
			data : {id : id},
			success : function(data){
				let result = data.trim();
				if(result == 0){
					checkIdFlag = true;
					alert("사용가능한 아이디입니다.");
				}else{
					checkIdFlag = false;
					alert("이미 존재하는 아이디입니다.");
				}
			},error:function(){
				console.log("error");
				checkIdFlag = false;
			}
		});
	}
	
	function resetIdFn(){
		checkIdFlag = false;
	}
	
	
	
	function checkNickFn(){
		let nick = document.frm.mnickNm.value;
		
		$.ajax({
			url : "checkNickNm.jsp",
			type : "get",
			data : {nick : nick},
			success : function(data){
			let result = data.trim();
			if(result == 0){
				checkNickNmFlag = true;
				alert("사용가능한 닉네임입니다.");
			}else{
				checkNickNmFlag = false;
				alert("이미 존재하는 닉네임입니다.");
			}
		},error:function(){
			console.log("error");
			checkNickNmFlag = false;
		}
			
		});
	}
	function resetNickFn(){
		checkNickNmFlag = false;
	}
	
	
	
	function validation(){
		if(checkId(mid) & checkPw(mpw) & checkPwRe(mpwRe) & checkNickNm(mnickNm)
		& checkName(mname) & checkBirth(mbirth) & checkPhone1(mphone1)
		& checkPhone2(mphone2) & checkPhone3(mphone3) & checkGender(mgender)
		& checkEmail(memail) & checkIdFlag & checkNickNmFlag){
			document.frm.submit();
		}	
		
	
	}
