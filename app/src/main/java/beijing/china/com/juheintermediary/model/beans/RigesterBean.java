package beijing.china.com.juheintermediary.model.beans;

/**
 * 注册登录实体类
 * Created by 宋佳霖 on 2017/2/24.
 */

public class RigesterBean {


    /**
     * code : 07000
     * message : 注册成功
     * userinfo : {"id_card":"","real_name":"","nick_name":"song","userId":"4e8d52dce4ce4a129782db35a3253e6c","phone_num":"13946168290","attestation_type":"1","user_head":"","addressId":"16ac7138d308472684eef0d45c29ea8b","token":"04D8679CD0EBF3CB6101333AA6E88E62CD11774C66254A2716A28D913D3B2270A1369CCDF0F9A71090158A6EEFF633EE"}
     */

        /**
         * id_card :
         * real_name :
         * nick_name : song
         * userId : 4e8d52dce4ce4a129782db35a3253e6c
         * phone_num : 13946168290
         * attestation_type : 1
         * user_head :
         * addressId : 16ac7138d308472684eef0d45c29ea8b
         * token : 04D8679CD0EBF3CB6101333AA6E88E62CD11774C66254A2716A28D913D3B2270A1369CCDF0F9A71090158A6EEFF633EE
         */

        private String id_card;
        private String real_name;
        private String nick_name;
        private String userId;
        private String phone_num;
        private String attestation_type;
        private String user_head;
        private String addressId;
        private String token;

        public String getId_card() {
            return id_card;
        }

        public void setId_card(String id_card) {
            this.id_card = id_card;
        }

        public String getReal_name() {
            return real_name;
        }

        public void setReal_name(String real_name) {
            this.real_name = real_name;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPhone_num() {
            return phone_num;
        }

        public void setPhone_num(String phone_num) {
            this.phone_num = phone_num;
        }

        public String getAttestation_type() {
            return attestation_type;
        }

        public void setAttestation_type(String attestation_type) {
            this.attestation_type = attestation_type;
        }

        public String getUser_head() {
            return user_head;
        }

        public void setUser_head(String user_head) {
            this.user_head = user_head;
        }

        public String getAddressId() {
            return addressId;
        }

        public void setAddressId(String addressId) {
            this.addressId = addressId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return "UserinfoBean{" +
                    "id_card='" + id_card + '\'' +
                    ", real_name='" + real_name + '\'' +
                    ", nick_name='" + nick_name + '\'' +
                    ", userId='" + userId + '\'' +
                    ", phone_num='" + phone_num + '\'' +
                    ", attestation_type='" + attestation_type + '\'' +
                    ", user_head='" + user_head + '\'' +
                    ", addressId='" + addressId + '\'' +
                    ", token='" + token + '\'' +
                    '}';
        }
    }

