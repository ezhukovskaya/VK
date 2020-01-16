package builders;

import constants.Parametres;
import constants.VkMethods;
import enums.ItemType;

public class LikeBuilder extends BaseBuilder {
    private static String createUserId(String userId) {
        return String.format(Parametres.USER_ID, userId);
    }

    private static String createItemId(int itemId) {
        return String.format(Parametres.ITEM_ID, itemId);
    }

    private static String createType(String type){
        return String.format(Parametres.TYPE, type);
    }

    public static String createIsPostLikedRequest(String ownerId, String userId, int itemId) {
        return String.format(createMethod(VkMethods.IS_LIKED),
                createAccessToken() + AMP + createVersion() + AMP + createOwnerId(ownerId) + AMP + createUserId(userId) + AMP + createItemId(itemId) + AMP + createType(ItemType.POST.name().toLowerCase()));
    }
}
