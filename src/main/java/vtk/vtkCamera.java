// java wrapper for vtkCamera object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCamera extends vtkObject
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

  private native void SetPosition_4(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_4(id0,id1,id2);
  }

  private native void SetPosition_5(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_5(id0);
  }

  private native double[] GetPosition_6();
  public double[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetFocalPoint_7(double id0,double id1,double id2);
  public void SetFocalPoint(double id0,double id1,double id2)
  {
    SetFocalPoint_7(id0,id1,id2);
  }

  private native void SetFocalPoint_8(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_8(id0);
  }

  private native double[] GetFocalPoint_9();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_9();
  }

  private native void SetViewUp_10(double id0,double id1,double id2);
  public void SetViewUp(double id0,double id1,double id2)
  {
    SetViewUp_10(id0,id1,id2);
  }

  private native void SetViewUp_11(double id0[]);
  public void SetViewUp(double id0[])
  {
    SetViewUp_11(id0);
  }

  private native double[] GetViewUp_12();
  public double[] GetViewUp()
  {
    return GetViewUp_12();
  }

  private native void OrthogonalizeViewUp_13();
  public void OrthogonalizeViewUp()
  {
    OrthogonalizeViewUp_13();
  }

  private native void SetDistance_14(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_14(id0);
  }

  private native double GetDistance_15();
  public double GetDistance()
  {
    return GetDistance_15();
  }

  private native double[] GetDirectionOfProjection_16();
  public double[] GetDirectionOfProjection()
  {
    return GetDirectionOfProjection_16();
  }

  private native void Dolly_17(double id0);
  public void Dolly(double id0)
  {
    Dolly_17(id0);
  }

  private native void SetRoll_18(double id0);
  public void SetRoll(double id0)
  {
    SetRoll_18(id0);
  }

  private native double GetRoll_19();
  public double GetRoll()
  {
    return GetRoll_19();
  }

  private native void Roll_20(double id0);
  public void Roll(double id0)
  {
    Roll_20(id0);
  }

  private native void Azimuth_21(double id0);
  public void Azimuth(double id0)
  {
    Azimuth_21(id0);
  }

  private native void Yaw_22(double id0);
  public void Yaw(double id0)
  {
    Yaw_22(id0);
  }

  private native void Elevation_23(double id0);
  public void Elevation(double id0)
  {
    Elevation_23(id0);
  }

  private native void Pitch_24(double id0);
  public void Pitch(double id0)
  {
    Pitch_24(id0);
  }

  private native void SetParallelProjection_25(int id0);
  public void SetParallelProjection(int id0)
  {
    SetParallelProjection_25(id0);
  }

  private native int GetParallelProjection_26();
  public int GetParallelProjection()
  {
    return GetParallelProjection_26();
  }

  private native void ParallelProjectionOn_27();
  public void ParallelProjectionOn()
  {
    ParallelProjectionOn_27();
  }

  private native void ParallelProjectionOff_28();
  public void ParallelProjectionOff()
  {
    ParallelProjectionOff_28();
  }

  private native void SetUseHorizontalViewAngle_29(int id0);
  public void SetUseHorizontalViewAngle(int id0)
  {
    SetUseHorizontalViewAngle_29(id0);
  }

  private native int GetUseHorizontalViewAngle_30();
  public int GetUseHorizontalViewAngle()
  {
    return GetUseHorizontalViewAngle_30();
  }

  private native void UseHorizontalViewAngleOn_31();
  public void UseHorizontalViewAngleOn()
  {
    UseHorizontalViewAngleOn_31();
  }

  private native void UseHorizontalViewAngleOff_32();
  public void UseHorizontalViewAngleOff()
  {
    UseHorizontalViewAngleOff_32();
  }

  private native void SetViewAngle_33(double id0);
  public void SetViewAngle(double id0)
  {
    SetViewAngle_33(id0);
  }

  private native double GetViewAngle_34();
  public double GetViewAngle()
  {
    return GetViewAngle_34();
  }

  private native void SetParallelScale_35(double id0);
  public void SetParallelScale(double id0)
  {
    SetParallelScale_35(id0);
  }

  private native double GetParallelScale_36();
  public double GetParallelScale()
  {
    return GetParallelScale_36();
  }

  private native void Zoom_37(double id0);
  public void Zoom(double id0)
  {
    Zoom_37(id0);
  }

  private native void SetClippingRange_38(double id0,double id1);
  public void SetClippingRange(double id0,double id1)
  {
    SetClippingRange_38(id0,id1);
  }

  private native void SetClippingRange_39(double id0[]);
  public void SetClippingRange(double id0[])
  {
    SetClippingRange_39(id0);
  }

  private native double[] GetClippingRange_40();
  public double[] GetClippingRange()
  {
    return GetClippingRange_40();
  }

  private native void SetThickness_41(double id0);
  public void SetThickness(double id0)
  {
    SetThickness_41(id0);
  }

  private native double GetThickness_42();
  public double GetThickness()
  {
    return GetThickness_42();
  }

  private native void SetWindowCenter_43(double id0,double id1);
  public void SetWindowCenter(double id0,double id1)
  {
    SetWindowCenter_43(id0,id1);
  }

  private native double[] GetWindowCenter_44();
  public double[] GetWindowCenter()
  {
    return GetWindowCenter_44();
  }

  private native void SetObliqueAngles_45(double id0,double id1);
  public void SetObliqueAngles(double id0,double id1)
  {
    SetObliqueAngles_45(id0,id1);
  }

  private native void ApplyTransform_46(vtkTransform id0);
  public void ApplyTransform(vtkTransform id0)
  {
    ApplyTransform_46(id0);
  }

  private native double[] GetViewPlaneNormal_47();
  public double[] GetViewPlaneNormal()
  {
    return GetViewPlaneNormal_47();
  }

  private native void SetViewShear_48(double id0,double id1,double id2);
  public void SetViewShear(double id0,double id1,double id2)
  {
    SetViewShear_48(id0,id1,id2);
  }

  private native void SetViewShear_49(double id0[]);
  public void SetViewShear(double id0[])
  {
    SetViewShear_49(id0);
  }

  private native double[] GetViewShear_50();
  public double[] GetViewShear()
  {
    return GetViewShear_50();
  }

  private native void SetEyeAngle_51(double id0);
  public void SetEyeAngle(double id0)
  {
    SetEyeAngle_51(id0);
  }

  private native double GetEyeAngle_52();
  public double GetEyeAngle()
  {
    return GetEyeAngle_52();
  }

  private native void SetFocalDisk_53(double id0);
  public void SetFocalDisk(double id0)
  {
    SetFocalDisk_53(id0);
  }

  private native double GetFocalDisk_54();
  public double GetFocalDisk()
  {
    return GetFocalDisk_54();
  }

  private native void SetFocalDistance_55(double id0);
  public void SetFocalDistance(double id0)
  {
    SetFocalDistance_55(id0);
  }

  private native double GetFocalDistance_56();
  public double GetFocalDistance()
  {
    return GetFocalDistance_56();
  }

  private native void SetUseOffAxisProjection_57(int id0);
  public void SetUseOffAxisProjection(int id0)
  {
    SetUseOffAxisProjection_57(id0);
  }

  private native int GetUseOffAxisProjection_58();
  public int GetUseOffAxisProjection()
  {
    return GetUseOffAxisProjection_58();
  }

  private native void UseOffAxisProjectionOn_59();
  public void UseOffAxisProjectionOn()
  {
    UseOffAxisProjectionOn_59();
  }

  private native void UseOffAxisProjectionOff_60();
  public void UseOffAxisProjectionOff()
  {
    UseOffAxisProjectionOff_60();
  }

  private native double GetOffAxisClippingAdjustment_61();
  public double GetOffAxisClippingAdjustment()
  {
    return GetOffAxisClippingAdjustment_61();
  }

  private native void SetScreenBottomLeft_62(double id0,double id1,double id2);
  public void SetScreenBottomLeft(double id0,double id1,double id2)
  {
    SetScreenBottomLeft_62(id0,id1,id2);
  }

  private native void SetScreenBottomLeft_63(double id0[]);
  public void SetScreenBottomLeft(double id0[])
  {
    SetScreenBottomLeft_63(id0);
  }

  private native double[] GetScreenBottomLeft_64();
  public double[] GetScreenBottomLeft()
  {
    return GetScreenBottomLeft_64();
  }

  private native void SetScreenBottomRight_65(double id0,double id1,double id2);
  public void SetScreenBottomRight(double id0,double id1,double id2)
  {
    SetScreenBottomRight_65(id0,id1,id2);
  }

  private native void SetScreenBottomRight_66(double id0[]);
  public void SetScreenBottomRight(double id0[])
  {
    SetScreenBottomRight_66(id0);
  }

  private native double[] GetScreenBottomRight_67();
  public double[] GetScreenBottomRight()
  {
    return GetScreenBottomRight_67();
  }

  private native void SetScreenTopRight_68(double id0,double id1,double id2);
  public void SetScreenTopRight(double id0,double id1,double id2)
  {
    SetScreenTopRight_68(id0,id1,id2);
  }

  private native void SetScreenTopRight_69(double id0[]);
  public void SetScreenTopRight(double id0[])
  {
    SetScreenTopRight_69(id0);
  }

  private native double[] GetScreenTopRight_70();
  public double[] GetScreenTopRight()
  {
    return GetScreenTopRight_70();
  }

  private native void SetEyeSeparation_71(double id0);
  public void SetEyeSeparation(double id0)
  {
    SetEyeSeparation_71(id0);
  }

  private native double GetEyeSeparation_72();
  public double GetEyeSeparation()
  {
    return GetEyeSeparation_72();
  }

  private native void SetEyePosition_73(double id0[]);
  public void SetEyePosition(double id0[])
  {
    SetEyePosition_73(id0);
  }

  private native void GetEyePosition_74(double id0[]);
  public void GetEyePosition(double id0[])
  {
    GetEyePosition_74(id0);
  }

  private native void GetStereoEyePosition_75(double id0[]);
  public void GetStereoEyePosition(double id0[])
  {
    GetStereoEyePosition_75(id0);
  }

  private native void GetEyePlaneNormal_76(double id0[]);
  public void GetEyePlaneNormal(double id0[])
  {
    GetEyePlaneNormal_76(id0);
  }

  private native void SetEyeTransformMatrix_77(vtkMatrix4x4 id0);
  public void SetEyeTransformMatrix(vtkMatrix4x4 id0)
  {
    SetEyeTransformMatrix_77(id0);
  }

  private native void SetEyeTransformMatrix_78(double id0[]);
  public void SetEyeTransformMatrix(double id0[])
  {
    SetEyeTransformMatrix_78(id0);
  }

  private native long GetEyeTransformMatrix_79();
  public vtkMatrix4x4 GetEyeTransformMatrix()
  {
    long temp = GetEyeTransformMatrix_79();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetModelTransformMatrix_80(vtkMatrix4x4 id0);
  public void SetModelTransformMatrix(vtkMatrix4x4 id0)
  {
    SetModelTransformMatrix_80(id0);
  }

  private native void SetModelTransformMatrix_81(double id0[]);
  public void SetModelTransformMatrix(double id0[])
  {
    SetModelTransformMatrix_81(id0);
  }

  private native long GetModelTransformMatrix_82();
  public vtkMatrix4x4 GetModelTransformMatrix()
  {
    long temp = GetModelTransformMatrix_82();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetModelViewTransformMatrix_83();
  public vtkMatrix4x4 GetModelViewTransformMatrix()
  {
    long temp = GetModelViewTransformMatrix_83();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetModelViewTransformObject_84();
  public vtkTransform GetModelViewTransformObject()
  {
    long temp = GetModelViewTransformObject_84();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewTransformMatrix_85();
  public vtkMatrix4x4 GetViewTransformMatrix()
  {
    long temp = GetViewTransformMatrix_85();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetViewTransformObject_86();
  public vtkTransform GetViewTransformObject()
  {
    long temp = GetViewTransformObject_86();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExplicitProjectionTransformMatrix_87(vtkMatrix4x4 id0);
  public void SetExplicitProjectionTransformMatrix(vtkMatrix4x4 id0)
  {
    SetExplicitProjectionTransformMatrix_87(id0);
  }

  private native long GetExplicitProjectionTransformMatrix_88();
  public vtkMatrix4x4 GetExplicitProjectionTransformMatrix()
  {
    long temp = GetExplicitProjectionTransformMatrix_88();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseExplicitProjectionTransformMatrix_89(boolean id0);
  public void SetUseExplicitProjectionTransformMatrix(boolean id0)
  {
    SetUseExplicitProjectionTransformMatrix_89(id0);
  }

  private native boolean GetUseExplicitProjectionTransformMatrix_90();
  public boolean GetUseExplicitProjectionTransformMatrix()
  {
    return GetUseExplicitProjectionTransformMatrix_90();
  }

  private native void UseExplicitProjectionTransformMatrixOn_91();
  public void UseExplicitProjectionTransformMatrixOn()
  {
    UseExplicitProjectionTransformMatrixOn_91();
  }

  private native void UseExplicitProjectionTransformMatrixOff_92();
  public void UseExplicitProjectionTransformMatrixOff()
  {
    UseExplicitProjectionTransformMatrixOff_92();
  }

  private native void SetExplicitAspectRatio_93(double id0);
  public void SetExplicitAspectRatio(double id0)
  {
    SetExplicitAspectRatio_93(id0);
  }

  private native double GetExplicitAspectRatio_94();
  public double GetExplicitAspectRatio()
  {
    return GetExplicitAspectRatio_94();
  }

  private native void SetUseExplicitAspectRatio_95(boolean id0);
  public void SetUseExplicitAspectRatio(boolean id0)
  {
    SetUseExplicitAspectRatio_95(id0);
  }

  private native boolean GetUseExplicitAspectRatio_96();
  public boolean GetUseExplicitAspectRatio()
  {
    return GetUseExplicitAspectRatio_96();
  }

  private native void UseExplicitAspectRatioOn_97();
  public void UseExplicitAspectRatioOn()
  {
    UseExplicitAspectRatioOn_97();
  }

  private native void UseExplicitAspectRatioOff_98();
  public void UseExplicitAspectRatioOff()
  {
    UseExplicitAspectRatioOff_98();
  }

  private native long GetProjectionTransformMatrix_99(double id0,double id1,double id2);
  public vtkMatrix4x4 GetProjectionTransformMatrix(double id0,double id1,double id2)
  {
    long temp = GetProjectionTransformMatrix_99(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProjectionTransformObject_100(double id0,double id1,double id2);
  public vtkPerspectiveTransform GetProjectionTransformObject(double id0,double id1,double id2)
  {
    long temp = GetProjectionTransformObject_100(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkPerspectiveTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeProjectionTransformMatrix_101(double id0,double id1,double id2);
  public vtkMatrix4x4 GetCompositeProjectionTransformMatrix(double id0,double id1,double id2)
  {
    long temp = GetCompositeProjectionTransformMatrix_101(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProjectionTransformMatrix_102(vtkRenderer id0);
  public vtkMatrix4x4 GetProjectionTransformMatrix(vtkRenderer id0)
  {
    long temp = GetProjectionTransformMatrix_102(id0);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserViewTransform_103(vtkHomogeneousTransform id0);
  public void SetUserViewTransform(vtkHomogeneousTransform id0)
  {
    SetUserViewTransform_103(id0);
  }

  private native long GetUserViewTransform_104();
  public vtkHomogeneousTransform GetUserViewTransform()
  {
    long temp = GetUserViewTransform_104();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserTransform_105(vtkHomogeneousTransform id0);
  public void SetUserTransform(vtkHomogeneousTransform id0)
  {
    SetUserTransform_105(id0);
  }

  private native long GetUserTransform_106();
  public vtkHomogeneousTransform GetUserTransform()
  {
    long temp = GetUserTransform_106();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_107(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_107(id0);
  }

  private native long GetViewingRaysMTime_108();
  public long GetViewingRaysMTime()
  {
    return GetViewingRaysMTime_108();
  }

  private native void ViewingRaysModified_109();
  public void ViewingRaysModified()
  {
    ViewingRaysModified_109();
  }

  private native void GetFrustumPlanes_110(double id0,double id1[]);
  public void GetFrustumPlanes(double id0,double id1[])
  {
    GetFrustumPlanes_110(id0,id1);
  }

  private native void UpdateIdealShiftScale_111(double id0);
  public void UpdateIdealShiftScale(double id0)
  {
    UpdateIdealShiftScale_111(id0);
  }

  private native double[] GetFocalPointShift_112();
  public double[] GetFocalPointShift()
  {
    return GetFocalPointShift_112();
  }

  private native double GetFocalPointScale_113();
  public double GetFocalPointScale()
  {
    return GetFocalPointScale_113();
  }

  private native double[] GetNearPlaneShift_114();
  public double[] GetNearPlaneShift()
  {
    return GetNearPlaneShift_114();
  }

  private native double GetNearPlaneScale_115();
  public double GetNearPlaneScale()
  {
    return GetNearPlaneScale_115();
  }

  private native void SetShiftScaleThreshold_116(double id0);
  public void SetShiftScaleThreshold(double id0)
  {
    SetShiftScaleThreshold_116(id0);
  }

  private native double GetShiftScaleThreshold_117();
  public double GetShiftScaleThreshold()
  {
    return GetShiftScaleThreshold_117();
  }

  private native double[] GetOrientation_118();
  public double[] GetOrientation()
  {
    return GetOrientation_118();
  }

  private native double[] GetOrientationWXYZ_119();
  public double[] GetOrientationWXYZ()
  {
    return GetOrientationWXYZ_119();
  }

  private native void ComputeViewPlaneNormal_120();
  public void ComputeViewPlaneNormal()
  {
    ComputeViewPlaneNormal_120();
  }

  private native long GetCameraLightTransformMatrix_121();
  public vtkMatrix4x4 GetCameraLightTransformMatrix()
  {
    long temp = GetCameraLightTransformMatrix_121();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateViewport_122(vtkRenderer id0);
  public void UpdateViewport(vtkRenderer id0)
  {
    UpdateViewport_122(id0);
  }

  private native int GetStereo_123();
  public int GetStereo()
  {
    return GetStereo_123();
  }

  private native void SetLeftEye_124(int id0);
  public void SetLeftEye(int id0)
  {
    SetLeftEye_124(id0);
  }

  private native int GetLeftEye_125();
  public int GetLeftEye()
  {
    return GetLeftEye_125();
  }

  private native void ShallowCopy_126(vtkCamera id0);
  public void ShallowCopy(vtkCamera id0)
  {
    ShallowCopy_126(id0);
  }

  private native void DeepCopy_127(vtkCamera id0);
  public void DeepCopy(vtkCamera id0)
  {
    DeepCopy_127(id0);
  }

  private native void SetFreezeFocalPoint_128(boolean id0);
  public void SetFreezeFocalPoint(boolean id0)
  {
    SetFreezeFocalPoint_128(id0);
  }

  private native boolean GetFreezeFocalPoint_129();
  public boolean GetFreezeFocalPoint()
  {
    return GetFreezeFocalPoint_129();
  }

  private native void SetUseScissor_130(boolean id0);
  public void SetUseScissor(boolean id0)
  {
    SetUseScissor_130(id0);
  }

  private native boolean GetUseScissor_131();
  public boolean GetUseScissor()
  {
    return GetUseScissor_131();
  }

  private native long GetInformation_132();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_132();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_133(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_133(id0);
  }

  public vtkCamera() { super(); }

  public vtkCamera(long id) { super(id); }
  public native long   VTKInit();

}
