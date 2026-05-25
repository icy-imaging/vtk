// java wrapper for vtkCoordinateFrameRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCoordinateFrameRepresentation extends vtkWidgetRepresentation
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

  private native void SetOrigin_4(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_4(id0,id1,id2);
  }

  private native void SetOrigin_5(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_5(id0);
  }

  private native double[] GetOrigin_6();
  public double[] GetOrigin()
  {
    return GetOrigin_6();
  }

  private native void SetNormal_7(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_7(id0,id1,id2);
  }

  private native void SetNormal_8(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_8(id0);
  }

  private native void SetNormalToCamera_9();
  public void SetNormalToCamera()
  {
    SetNormalToCamera_9();
  }

  private native double[] GetXVectorNormal_10();
  public double[] GetXVectorNormal()
  {
    return GetXVectorNormal_10();
  }

  private native double[] GetYVectorNormal_11();
  public double[] GetYVectorNormal()
  {
    return GetYVectorNormal_11();
  }

  private native double[] GetZVectorNormal_12();
  public double[] GetZVectorNormal()
  {
    return GetZVectorNormal_12();
  }

  private native void SetDirection_13(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_13(id0,id1,id2);
  }

  private native void SetDirection_14(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_14(id0);
  }

  private native void SetXAxisVector_15(double id0[]);
  public void SetXAxisVector(double id0[])
  {
    SetXAxisVector_15(id0);
  }

  private native void SetXAxisVector_16(double id0,double id1,double id2);
  public void SetXAxisVector(double id0,double id1,double id2)
  {
    SetXAxisVector_16(id0,id1,id2);
  }

  private native void SetYAxisVector_17(double id0[]);
  public void SetYAxisVector(double id0[])
  {
    SetYAxisVector_17(id0);
  }

  private native void SetYAxisVector_18(double id0,double id1,double id2);
  public void SetYAxisVector(double id0,double id1,double id2)
  {
    SetYAxisVector_18(id0,id1,id2);
  }

  private native void SetZAxisVector_19(double id0[]);
  public void SetZAxisVector(double id0[])
  {
    SetZAxisVector_19(id0);
  }

  private native void SetZAxisVector_20(double id0,double id1,double id2);
  public void SetZAxisVector(double id0,double id1,double id2)
  {
    SetZAxisVector_20(id0,id1,id2);
  }

  private native void SetLockNormalToCamera_21(int id0);
  public void SetLockNormalToCamera(int id0)
  {
    SetLockNormalToCamera_21(id0);
  }

  private native int GetLockNormalToCamera_22();
  public int GetLockNormalToCamera()
  {
    return GetLockNormalToCamera_22();
  }

  private native void LockNormalToCameraOn_23();
  public void LockNormalToCameraOn()
  {
    LockNormalToCameraOn_23();
  }

  private native void LockNormalToCameraOff_24();
  public void LockNormalToCameraOff()
  {
    LockNormalToCameraOff_24();
  }

  private native void SetXTranslationAxisOn_25();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_25();
  }

  private native void SetYTranslationAxisOn_26();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_26();
  }

  private native void SetZTranslationAxisOn_27();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_27();
  }

  private native void SetTranslationAxisOff_28();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_28();
  }

  private native boolean IsTranslationConstrained_29();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_29();
  }

  private native void UpdatePlacement_30();
  public void UpdatePlacement()
  {
    UpdatePlacement_30();
  }

  private native void Reset_31();
  public void Reset()
  {
    Reset_31();
  }

  private native void ResetAxes_32();
  public void ResetAxes()
  {
    ResetAxes_32();
  }

  private native long GetOriginProperty_33();
  public vtkProperty GetOriginProperty()
  {
    long temp = GetOriginProperty_33();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOriginProperty_34();
  public vtkProperty GetSelectedOriginProperty()
  {
    long temp = GetSelectedOriginProperty_34();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXVectorProperty_35();
  public vtkProperty GetXVectorProperty()
  {
    long temp = GetXVectorProperty_35();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedXVectorProperty_36();
  public vtkProperty GetSelectedXVectorProperty()
  {
    long temp = GetSelectedXVectorProperty_36();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLockedXVectorProperty_37();
  public vtkProperty GetLockedXVectorProperty()
  {
    long temp = GetLockedXVectorProperty_37();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLockedXVectorProperty_38();
  public vtkProperty GetSelectedLockedXVectorProperty()
  {
    long temp = GetSelectedLockedXVectorProperty_38();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnlockedXVectorProperty_39();
  public vtkProperty GetUnlockedXVectorProperty()
  {
    long temp = GetUnlockedXVectorProperty_39();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedUnlockedXVectorProperty_40();
  public vtkProperty GetSelectedUnlockedXVectorProperty()
  {
    long temp = GetSelectedUnlockedXVectorProperty_40();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYVectorProperty_41();
  public vtkProperty GetYVectorProperty()
  {
    long temp = GetYVectorProperty_41();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedYVectorProperty_42();
  public vtkProperty GetSelectedYVectorProperty()
  {
    long temp = GetSelectedYVectorProperty_42();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLockedYVectorProperty_43();
  public vtkProperty GetLockedYVectorProperty()
  {
    long temp = GetLockedYVectorProperty_43();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLockedYVectorProperty_44();
  public vtkProperty GetSelectedLockedYVectorProperty()
  {
    long temp = GetSelectedLockedYVectorProperty_44();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnlockedYVectorProperty_45();
  public vtkProperty GetUnlockedYVectorProperty()
  {
    long temp = GetUnlockedYVectorProperty_45();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedUnlockedYVectorProperty_46();
  public vtkProperty GetSelectedUnlockedYVectorProperty()
  {
    long temp = GetSelectedUnlockedYVectorProperty_46();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZVectorProperty_47();
  public vtkProperty GetZVectorProperty()
  {
    long temp = GetZVectorProperty_47();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedZVectorProperty_48();
  public vtkProperty GetSelectedZVectorProperty()
  {
    long temp = GetSelectedZVectorProperty_48();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLockedZVectorProperty_49();
  public vtkProperty GetLockedZVectorProperty()
  {
    long temp = GetLockedZVectorProperty_49();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLockedZVectorProperty_50();
  public vtkProperty GetSelectedLockedZVectorProperty()
  {
    long temp = GetSelectedLockedZVectorProperty_50();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetUnlockedZVectorProperty_51();
  public vtkProperty GetUnlockedZVectorProperty()
  {
    long temp = GetUnlockedZVectorProperty_51();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedUnlockedZVectorProperty_52();
  public vtkProperty GetSelectedUnlockedZVectorProperty()
  {
    long temp = GetSelectedUnlockedZVectorProperty_52();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetPickCameraFocalInfo_53();
  public boolean GetPickCameraFocalInfo()
  {
    return GetPickCameraFocalInfo_53();
  }

  private native void SetPickCameraFocalInfo_54(boolean id0);
  public void SetPickCameraFocalInfo(boolean id0)
  {
    SetPickCameraFocalInfo_54(id0);
  }

  private native void PickCameraFocalInfoOn_55();
  public void PickCameraFocalInfoOn()
  {
    PickCameraFocalInfoOn_55();
  }

  private native void PickCameraFocalInfoOff_56();
  public void PickCameraFocalInfoOff()
  {
    PickCameraFocalInfoOff_56();
  }

  private native boolean PickOrigin_57(int id0,int id1,boolean id2);
  public boolean PickOrigin(int id0,int id1,boolean id2)
  {
    return PickOrigin_57(id0,id1,id2);
  }

  private native boolean PickNormal_58(int id0,int id1,boolean id2);
  public boolean PickNormal(int id0,int id1,boolean id2)
  {
    return PickNormal_58(id0,id1,id2);
  }

  private native boolean PickDirectionPoint_59(int id0,int id1,boolean id2);
  public boolean PickDirectionPoint(int id0,int id1,boolean id2)
  {
    return PickDirectionPoint_59(id0,id1,id2);
  }

  private native int GetLockedAxis_60();
  public int GetLockedAxis()
  {
    return GetLockedAxis_60();
  }

  private native void SetLockedAxis_61(int id0);
  public void SetLockedAxis(int id0)
  {
    SetLockedAxis_61(id0);
  }

  private native int ComputeInteractionState_62(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_62(id0,id1,id2);
  }

  private native void PlaceWidget_63(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_63(id0);
  }

  private native void BuildRepresentation_64();
  public void BuildRepresentation()
  {
    BuildRepresentation_64();
  }

  private native void StartWidgetInteraction_65(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_65(id0);
  }

  private native void WidgetInteraction_66(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_66(id0);
  }

  private native void EndWidgetInteraction_67(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_67(id0);
  }

  private native double[] GetBounds_68();
  public double[] GetBounds()
  {
    return GetBounds_68();
  }

  private native void GetActors_69(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_69(id0);
  }

  private native void ReleaseGraphicsResources_70(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_70(id0);
  }

  private native int RenderOpaqueGeometry_71(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_71(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_72(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_72(id0);
  }

  private native int HasTranslucentPolygonalGeometry_73();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_73();
  }

  private native void SetInteractionState_74(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_74(id0);
  }

  private native int GetInteractionStateMinValue_75();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_75();
  }

  private native int GetInteractionStateMaxValue_76();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_76();
  }

  private native void SetRepresentationState_77(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_77(id0);
  }

  private native int GetRepresentationState_78();
  public int GetRepresentationState()
  {
    return GetRepresentationState_78();
  }

  private native void SetLengthFactor_79(double id0);
  public void SetLengthFactor(double id0)
  {
    SetLengthFactor_79(id0);
  }

  private native double GetLengthFactorMinValue_80();
  public double GetLengthFactorMinValue()
  {
    return GetLengthFactorMinValue_80();
  }

  private native double GetLengthFactorMaxValue_81();
  public double GetLengthFactorMaxValue()
  {
    return GetLengthFactorMaxValue_81();
  }

  private native double GetLengthFactor_82();
  public double GetLengthFactor()
  {
    return GetLengthFactor_82();
  }

  public vtkCoordinateFrameRepresentation() { super(); }

  public vtkCoordinateFrameRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
