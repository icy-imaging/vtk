// java wrapper for vtkImagePlaneWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImagePlaneWidget extends vtkPolyDataSourceWidget
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetInputConnection_8(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_8(id0);
  }

  private native void SetOrigin_9(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_9(id0,id1,id2);
  }

  private native void SetOrigin_10(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_10(id0);
  }

  private native double[] GetOrigin_11();
  public double[] GetOrigin()
  {
    return GetOrigin_11();
  }

  private native void GetOrigin_12(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_12(id0);
  }

  private native void SetPoint1_13(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_13(id0,id1,id2);
  }

  private native void SetPoint1_14(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_14(id0);
  }

  private native double[] GetPoint1_15();
  public double[] GetPoint1()
  {
    return GetPoint1_15();
  }

  private native void GetPoint1_16(double id0[]);
  public void GetPoint1(double id0[])
  {
    GetPoint1_16(id0);
  }

  private native void SetPoint2_17(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_17(id0,id1,id2);
  }

  private native void SetPoint2_18(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_18(id0);
  }

  private native double[] GetPoint2_19();
  public double[] GetPoint2()
  {
    return GetPoint2_19();
  }

  private native void GetPoint2_20(double id0[]);
  public void GetPoint2(double id0[])
  {
    GetPoint2_20(id0);
  }

  private native double[] GetCenter_21();
  public double[] GetCenter()
  {
    return GetCenter_21();
  }

  private native void GetCenter_22(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_22(id0);
  }

  private native double[] GetNormal_23();
  public double[] GetNormal()
  {
    return GetNormal_23();
  }

  private native void GetNormal_24(double id0[]);
  public void GetNormal(double id0[])
  {
    GetNormal_24(id0);
  }

  private native void GetVector1_25(double id0[]);
  public void GetVector1(double id0[])
  {
    GetVector1_25(id0);
  }

  private native void GetVector2_26(double id0[]);
  public void GetVector2(double id0[])
  {
    GetVector2_26(id0);
  }

  private native int GetSliceIndex_27();
  public int GetSliceIndex()
  {
    return GetSliceIndex_27();
  }

  private native void SetSliceIndex_28(int id0);
  public void SetSliceIndex(int id0)
  {
    SetSliceIndex_28(id0);
  }

  private native double GetSlicePosition_29();
  public double GetSlicePosition()
  {
    return GetSlicePosition_29();
  }

  private native void SetSlicePosition_30(double id0);
  public void SetSlicePosition(double id0)
  {
    SetSlicePosition_30(id0);
  }

  private native void SetResliceInterpolate_31(int id0);
  public void SetResliceInterpolate(int id0)
  {
    SetResliceInterpolate_31(id0);
  }

  private native int GetResliceInterpolate_32();
  public int GetResliceInterpolate()
  {
    return GetResliceInterpolate_32();
  }

  private native void SetResliceInterpolateToNearestNeighbour_33();
  public void SetResliceInterpolateToNearestNeighbour()
  {
    SetResliceInterpolateToNearestNeighbour_33();
  }

  private native void SetResliceInterpolateToLinear_34();
  public void SetResliceInterpolateToLinear()
  {
    SetResliceInterpolateToLinear_34();
  }

  private native void SetResliceInterpolateToCubic_35();
  public void SetResliceInterpolateToCubic()
  {
    SetResliceInterpolateToCubic_35();
  }

  private native long GetResliceOutput_36();
  public vtkImageData GetResliceOutput()
  {
    long temp = GetResliceOutput_36();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRestrictPlaneToVolume_37(int id0);
  public void SetRestrictPlaneToVolume(int id0)
  {
    SetRestrictPlaneToVolume_37(id0);
  }

  private native int GetRestrictPlaneToVolume_38();
  public int GetRestrictPlaneToVolume()
  {
    return GetRestrictPlaneToVolume_38();
  }

  private native void RestrictPlaneToVolumeOn_39();
  public void RestrictPlaneToVolumeOn()
  {
    RestrictPlaneToVolumeOn_39();
  }

  private native void RestrictPlaneToVolumeOff_40();
  public void RestrictPlaneToVolumeOff()
  {
    RestrictPlaneToVolumeOff_40();
  }

  private native void SetUserControlledLookupTable_41(int id0);
  public void SetUserControlledLookupTable(int id0)
  {
    SetUserControlledLookupTable_41(id0);
  }

  private native int GetUserControlledLookupTable_42();
  public int GetUserControlledLookupTable()
  {
    return GetUserControlledLookupTable_42();
  }

  private native void UserControlledLookupTableOn_43();
  public void UserControlledLookupTableOn()
  {
    UserControlledLookupTableOn_43();
  }

  private native void UserControlledLookupTableOff_44();
  public void UserControlledLookupTableOff()
  {
    UserControlledLookupTableOff_44();
  }

  private native void SetTextureInterpolate_45(int id0);
  public void SetTextureInterpolate(int id0)
  {
    SetTextureInterpolate_45(id0);
  }

  private native int GetTextureInterpolate_46();
  public int GetTextureInterpolate()
  {
    return GetTextureInterpolate_46();
  }

  private native void TextureInterpolateOn_47();
  public void TextureInterpolateOn()
  {
    TextureInterpolateOn_47();
  }

  private native void TextureInterpolateOff_48();
  public void TextureInterpolateOff()
  {
    TextureInterpolateOff_48();
  }

  private native void SetTextureVisibility_49(int id0);
  public void SetTextureVisibility(int id0)
  {
    SetTextureVisibility_49(id0);
  }

  private native int GetTextureVisibility_50();
  public int GetTextureVisibility()
  {
    return GetTextureVisibility_50();
  }

  private native void TextureVisibilityOn_51();
  public void TextureVisibilityOn()
  {
    TextureVisibilityOn_51();
  }

  private native void TextureVisibilityOff_52();
  public void TextureVisibilityOff()
  {
    TextureVisibilityOff_52();
  }

  private native void GetPolyData_53(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_53(id0);
  }

  private native long GetPolyDataAlgorithm_54();
  public vtkPolyDataAlgorithm GetPolyDataAlgorithm()
  {
    long temp = GetPolyDataAlgorithm_54();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdatePlacement_55();
  public void UpdatePlacement()
  {
    UpdatePlacement_55();
  }

  private native long GetTexture_56();
  public vtkTexture GetTexture()
  {
    long temp = GetTexture_56();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorMap_57();
  public vtkImageMapToColors GetColorMap()
  {
    long temp = GetColorMap_57();

    if (temp == 0) return null;
    return (vtkImageMapToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColorMap_58(vtkImageMapToColors id0);
  public void SetColorMap(vtkImageMapToColors id0)
  {
    SetColorMap_58(id0);
  }

  private native void SetPlaneProperty_59(vtkProperty id0);
  public void SetPlaneProperty(vtkProperty id0)
  {
    SetPlaneProperty_59(id0);
  }

  private native long GetPlaneProperty_60();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_60();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectedPlaneProperty_61(vtkProperty id0);
  public void SetSelectedPlaneProperty(vtkProperty id0)
  {
    SetSelectedPlaneProperty_61(id0);
  }

  private native long GetSelectedPlaneProperty_62();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_62();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlaneOrientation_63(int id0);
  public void SetPlaneOrientation(int id0)
  {
    SetPlaneOrientation_63(id0);
  }

  private native int GetPlaneOrientation_64();
  public int GetPlaneOrientation()
  {
    return GetPlaneOrientation_64();
  }

  private native void SetPlaneOrientationToXAxes_65();
  public void SetPlaneOrientationToXAxes()
  {
    SetPlaneOrientationToXAxes_65();
  }

  private native void SetPlaneOrientationToYAxes_66();
  public void SetPlaneOrientationToYAxes()
  {
    SetPlaneOrientationToYAxes_66();
  }

  private native void SetPlaneOrientationToZAxes_67();
  public void SetPlaneOrientationToZAxes()
  {
    SetPlaneOrientationToZAxes_67();
  }

  private native void SetPicker_68(vtkAbstractPropPicker id0);
  public void SetPicker(vtkAbstractPropPicker id0)
  {
    SetPicker_68(id0);
  }

  private native void SetLookupTable_69(vtkLookupTable id0);
  public void SetLookupTable(vtkLookupTable id0)
  {
    SetLookupTable_69(id0);
  }

  private native long GetLookupTable_70();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_70();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplayText_71(int id0);
  public void SetDisplayText(int id0)
  {
    SetDisplayText_71(id0);
  }

  private native int GetDisplayText_72();
  public int GetDisplayText()
  {
    return GetDisplayText_72();
  }

  private native void DisplayTextOn_73();
  public void DisplayTextOn()
  {
    DisplayTextOn_73();
  }

  private native void DisplayTextOff_74();
  public void DisplayTextOff()
  {
    DisplayTextOff_74();
  }

  private native void SetCursorProperty_75(vtkProperty id0);
  public void SetCursorProperty(vtkProperty id0)
  {
    SetCursorProperty_75(id0);
  }

  private native long GetCursorProperty_76();
  public vtkProperty GetCursorProperty()
  {
    long temp = GetCursorProperty_76();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMarginProperty_77(vtkProperty id0);
  public void SetMarginProperty(vtkProperty id0)
  {
    SetMarginProperty_77(id0);
  }

  private native long GetMarginProperty_78();
  public vtkProperty GetMarginProperty()
  {
    long temp = GetMarginProperty_78();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMarginSizeX_79(double id0);
  public void SetMarginSizeX(double id0)
  {
    SetMarginSizeX_79(id0);
  }

  private native double GetMarginSizeXMinValue_80();
  public double GetMarginSizeXMinValue()
  {
    return GetMarginSizeXMinValue_80();
  }

  private native double GetMarginSizeXMaxValue_81();
  public double GetMarginSizeXMaxValue()
  {
    return GetMarginSizeXMaxValue_81();
  }

  private native double GetMarginSizeX_82();
  public double GetMarginSizeX()
  {
    return GetMarginSizeX_82();
  }

  private native void SetMarginSizeY_83(double id0);
  public void SetMarginSizeY(double id0)
  {
    SetMarginSizeY_83(id0);
  }

  private native double GetMarginSizeYMinValue_84();
  public double GetMarginSizeYMinValue()
  {
    return GetMarginSizeYMinValue_84();
  }

  private native double GetMarginSizeYMaxValue_85();
  public double GetMarginSizeYMaxValue()
  {
    return GetMarginSizeYMaxValue_85();
  }

  private native double GetMarginSizeY_86();
  public double GetMarginSizeY()
  {
    return GetMarginSizeY_86();
  }

  private native void SetTextProperty_87(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_87(id0);
  }

  private native long GetTextProperty_88();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_88();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTexturePlaneProperty_89(vtkProperty id0);
  public void SetTexturePlaneProperty(vtkProperty id0)
  {
    SetTexturePlaneProperty_89(id0);
  }

  private native long GetTexturePlaneProperty_90();
  public vtkProperty GetTexturePlaneProperty()
  {
    long temp = GetTexturePlaneProperty_90();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWindowLevel_91(double id0,double id1,int id2);
  public void SetWindowLevel(double id0,double id1,int id2)
  {
    SetWindowLevel_91(id0,id1,id2);
  }

  private native void GetWindowLevel_92(double id0[]);
  public void GetWindowLevel(double id0[])
  {
    GetWindowLevel_92(id0);
  }

  private native double GetWindow_93();
  public double GetWindow()
  {
    return GetWindow_93();
  }

  private native double GetLevel_94();
  public double GetLevel()
  {
    return GetLevel_94();
  }

  private native int GetCursorData_95(double id0[]);
  public int GetCursorData(double id0[])
  {
    return GetCursorData_95(id0);
  }

  private native int GetCursorDataStatus_96();
  public int GetCursorDataStatus()
  {
    return GetCursorDataStatus_96();
  }

  private native double[] GetCurrentCursorPosition_97();
  public double[] GetCurrentCursorPosition()
  {
    return GetCurrentCursorPosition_97();
  }

  private native double GetCurrentImageValue_98();
  public double GetCurrentImageValue()
  {
    return GetCurrentImageValue_98();
  }

  private native long GetResliceAxes_99();
  public vtkMatrix4x4 GetResliceAxes()
  {
    long temp = GetResliceAxes_99();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetReslice_100();
  public vtkImageReslice GetReslice()
  {
    long temp = GetReslice_100();

    if (temp == 0) return null;
    return (vtkImageReslice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseContinuousCursor_101(int id0);
  public void SetUseContinuousCursor(int id0)
  {
    SetUseContinuousCursor_101(id0);
  }

  private native int GetUseContinuousCursor_102();
  public int GetUseContinuousCursor()
  {
    return GetUseContinuousCursor_102();
  }

  private native void UseContinuousCursorOn_103();
  public void UseContinuousCursorOn()
  {
    UseContinuousCursorOn_103();
  }

  private native void UseContinuousCursorOff_104();
  public void UseContinuousCursorOff()
  {
    UseContinuousCursorOff_104();
  }

  private native void SetInteraction_105(int id0);
  public void SetInteraction(int id0)
  {
    SetInteraction_105(id0);
  }

  private native int GetInteraction_106();
  public int GetInteraction()
  {
    return GetInteraction_106();
  }

  private native void InteractionOn_107();
  public void InteractionOn()
  {
    InteractionOn_107();
  }

  private native void InteractionOff_108();
  public void InteractionOff()
  {
    InteractionOff_108();
  }

  private native void SetLeftButtonAction_109(int id0);
  public void SetLeftButtonAction(int id0)
  {
    SetLeftButtonAction_109(id0);
  }

  private native int GetLeftButtonActionMinValue_110();
  public int GetLeftButtonActionMinValue()
  {
    return GetLeftButtonActionMinValue_110();
  }

  private native int GetLeftButtonActionMaxValue_111();
  public int GetLeftButtonActionMaxValue()
  {
    return GetLeftButtonActionMaxValue_111();
  }

  private native int GetLeftButtonAction_112();
  public int GetLeftButtonAction()
  {
    return GetLeftButtonAction_112();
  }

  private native void SetMiddleButtonAction_113(int id0);
  public void SetMiddleButtonAction(int id0)
  {
    SetMiddleButtonAction_113(id0);
  }

  private native int GetMiddleButtonActionMinValue_114();
  public int GetMiddleButtonActionMinValue()
  {
    return GetMiddleButtonActionMinValue_114();
  }

  private native int GetMiddleButtonActionMaxValue_115();
  public int GetMiddleButtonActionMaxValue()
  {
    return GetMiddleButtonActionMaxValue_115();
  }

  private native int GetMiddleButtonAction_116();
  public int GetMiddleButtonAction()
  {
    return GetMiddleButtonAction_116();
  }

  private native void SetRightButtonAction_117(int id0);
  public void SetRightButtonAction(int id0)
  {
    SetRightButtonAction_117(id0);
  }

  private native int GetRightButtonActionMinValue_118();
  public int GetRightButtonActionMinValue()
  {
    return GetRightButtonActionMinValue_118();
  }

  private native int GetRightButtonActionMaxValue_119();
  public int GetRightButtonActionMaxValue()
  {
    return GetRightButtonActionMaxValue_119();
  }

  private native int GetRightButtonAction_120();
  public int GetRightButtonAction()
  {
    return GetRightButtonAction_120();
  }

  private native void SetLeftButtonAutoModifier_121(int id0);
  public void SetLeftButtonAutoModifier(int id0)
  {
    SetLeftButtonAutoModifier_121(id0);
  }

  private native int GetLeftButtonAutoModifierMinValue_122();
  public int GetLeftButtonAutoModifierMinValue()
  {
    return GetLeftButtonAutoModifierMinValue_122();
  }

  private native int GetLeftButtonAutoModifierMaxValue_123();
  public int GetLeftButtonAutoModifierMaxValue()
  {
    return GetLeftButtonAutoModifierMaxValue_123();
  }

  private native int GetLeftButtonAutoModifier_124();
  public int GetLeftButtonAutoModifier()
  {
    return GetLeftButtonAutoModifier_124();
  }

  private native void SetMiddleButtonAutoModifier_125(int id0);
  public void SetMiddleButtonAutoModifier(int id0)
  {
    SetMiddleButtonAutoModifier_125(id0);
  }

  private native int GetMiddleButtonAutoModifierMinValue_126();
  public int GetMiddleButtonAutoModifierMinValue()
  {
    return GetMiddleButtonAutoModifierMinValue_126();
  }

  private native int GetMiddleButtonAutoModifierMaxValue_127();
  public int GetMiddleButtonAutoModifierMaxValue()
  {
    return GetMiddleButtonAutoModifierMaxValue_127();
  }

  private native int GetMiddleButtonAutoModifier_128();
  public int GetMiddleButtonAutoModifier()
  {
    return GetMiddleButtonAutoModifier_128();
  }

  private native void SetRightButtonAutoModifier_129(int id0);
  public void SetRightButtonAutoModifier(int id0)
  {
    SetRightButtonAutoModifier_129(id0);
  }

  private native int GetRightButtonAutoModifierMinValue_130();
  public int GetRightButtonAutoModifierMinValue()
  {
    return GetRightButtonAutoModifierMinValue_130();
  }

  private native int GetRightButtonAutoModifierMaxValue_131();
  public int GetRightButtonAutoModifierMaxValue()
  {
    return GetRightButtonAutoModifierMaxValue_131();
  }

  private native int GetRightButtonAutoModifier_132();
  public int GetRightButtonAutoModifier()
  {
    return GetRightButtonAutoModifier_132();
  }

  public vtkImagePlaneWidget() { super(); }

  public vtkImagePlaneWidget(long id) { super(id); }
  public native long   VTKInit();

}
