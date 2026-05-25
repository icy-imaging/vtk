// java wrapper for vtkEncodedGradientEstimator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEncodedGradientEstimator extends vtkObject
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

  private native void SetInputData_4(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInputData_5();
  public vtkImageData GetInputData()
  {
    long temp = GetInputData_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGradientMagnitudeScale_6(float id0);
  public void SetGradientMagnitudeScale(float id0)
  {
    SetGradientMagnitudeScale_6(id0);
  }

  private native float GetGradientMagnitudeScale_7();
  public float GetGradientMagnitudeScale()
  {
    return GetGradientMagnitudeScale_7();
  }

  private native void SetGradientMagnitudeBias_8(float id0);
  public void SetGradientMagnitudeBias(float id0)
  {
    SetGradientMagnitudeBias_8(id0);
  }

  private native float GetGradientMagnitudeBias_9();
  public float GetGradientMagnitudeBias()
  {
    return GetGradientMagnitudeBias_9();
  }

  private native void SetBoundsClip_10(int id0);
  public void SetBoundsClip(int id0)
  {
    SetBoundsClip_10(id0);
  }

  private native int GetBoundsClipMinValue_11();
  public int GetBoundsClipMinValue()
  {
    return GetBoundsClipMinValue_11();
  }

  private native int GetBoundsClipMaxValue_12();
  public int GetBoundsClipMaxValue()
  {
    return GetBoundsClipMaxValue_12();
  }

  private native int GetBoundsClip_13();
  public int GetBoundsClip()
  {
    return GetBoundsClip_13();
  }

  private native void BoundsClipOn_14();
  public void BoundsClipOn()
  {
    BoundsClipOn_14();
  }

  private native void BoundsClipOff_15();
  public void BoundsClipOff()
  {
    BoundsClipOff_15();
  }

  private native void SetBounds_16(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetBounds(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetBounds_16(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_17(int id0[]);
  public void SetBounds(int id0[])
  {
    SetBounds_17(id0);
  }

  private native int[] GetBounds_18();
  public int[] GetBounds()
  {
    return GetBounds_18();
  }

  private native void Update_19();
  public void Update()
  {
    Update_19();
  }

  private native int GetEncodedNormalIndex_20(long id0);
  public int GetEncodedNormalIndex(long id0)
  {
    return GetEncodedNormalIndex_20(id0);
  }

  private native int GetEncodedNormalIndex_21(int id0,int id1,int id2);
  public int GetEncodedNormalIndex(int id0,int id1,int id2)
  {
    return GetEncodedNormalIndex_21(id0,id1,id2);
  }

  private native void SetNumberOfThreads_22(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_22(id0);
  }

  private native int GetNumberOfThreadsMinValue_23();
  public int GetNumberOfThreadsMinValue()
  {
    return GetNumberOfThreadsMinValue_23();
  }

  private native int GetNumberOfThreadsMaxValue_24();
  public int GetNumberOfThreadsMaxValue()
  {
    return GetNumberOfThreadsMaxValue_24();
  }

  private native int GetNumberOfThreads_25();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_25();
  }

  private native void SetDirectionEncoder_26(vtkDirectionEncoder id0);
  public void SetDirectionEncoder(vtkDirectionEncoder id0)
  {
    SetDirectionEncoder_26(id0);
  }

  private native long GetDirectionEncoder_27();
  public vtkDirectionEncoder GetDirectionEncoder()
  {
    long temp = GetDirectionEncoder_27();

    if (temp == 0) return null;
    return (vtkDirectionEncoder)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeGradientMagnitudes_28(int id0);
  public void SetComputeGradientMagnitudes(int id0)
  {
    SetComputeGradientMagnitudes_28(id0);
  }

  private native int GetComputeGradientMagnitudes_29();
  public int GetComputeGradientMagnitudes()
  {
    return GetComputeGradientMagnitudes_29();
  }

  private native void ComputeGradientMagnitudesOn_30();
  public void ComputeGradientMagnitudesOn()
  {
    ComputeGradientMagnitudesOn_30();
  }

  private native void ComputeGradientMagnitudesOff_31();
  public void ComputeGradientMagnitudesOff()
  {
    ComputeGradientMagnitudesOff_31();
  }

  private native void SetCylinderClip_32(int id0);
  public void SetCylinderClip(int id0)
  {
    SetCylinderClip_32(id0);
  }

  private native int GetCylinderClip_33();
  public int GetCylinderClip()
  {
    return GetCylinderClip_33();
  }

  private native void CylinderClipOn_34();
  public void CylinderClipOn()
  {
    CylinderClipOn_34();
  }

  private native void CylinderClipOff_35();
  public void CylinderClipOff()
  {
    CylinderClipOff_35();
  }

  private native float GetLastUpdateTimeInSeconds_36();
  public float GetLastUpdateTimeInSeconds()
  {
    return GetLastUpdateTimeInSeconds_36();
  }

  private native float GetLastUpdateTimeInCPUSeconds_37();
  public float GetLastUpdateTimeInCPUSeconds()
  {
    return GetLastUpdateTimeInCPUSeconds_37();
  }

  private native int GetUseCylinderClip_38();
  public int GetUseCylinderClip()
  {
    return GetUseCylinderClip_38();
  }

  private native void SetZeroNormalThreshold_39(float id0);
  public void SetZeroNormalThreshold(float id0)
  {
    SetZeroNormalThreshold_39(id0);
  }

  private native float GetZeroNormalThreshold_40();
  public float GetZeroNormalThreshold()
  {
    return GetZeroNormalThreshold_40();
  }

  private native void SetZeroPad_41(int id0);
  public void SetZeroPad(int id0)
  {
    SetZeroPad_41(id0);
  }

  private native int GetZeroPadMinValue_42();
  public int GetZeroPadMinValue()
  {
    return GetZeroPadMinValue_42();
  }

  private native int GetZeroPadMaxValue_43();
  public int GetZeroPadMaxValue()
  {
    return GetZeroPadMaxValue_43();
  }

  private native int GetZeroPad_44();
  public int GetZeroPad()
  {
    return GetZeroPad_44();
  }

  private native void ZeroPadOn_45();
  public void ZeroPadOn()
  {
    ZeroPadOn_45();
  }

  private native void ZeroPadOff_46();
  public void ZeroPadOff()
  {
    ZeroPadOff_46();
  }

  private native int[] GetInputSize_47();
  public int[] GetInputSize()
  {
    return GetInputSize_47();
  }

  private native float[] GetInputAspect_48();
  public float[] GetInputAspect()
  {
    return GetInputAspect_48();
  }

  public vtkEncodedGradientEstimator() { super(); }

  public vtkEncodedGradientEstimator(long id) { super(id); }

}
