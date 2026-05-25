// java wrapper for vtkAbstractImageInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractImageInterpolator extends vtkObject
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

  private native void Initialize_4(vtkDataObject id0);
  public void Initialize(vtkDataObject id0)
  {
    Initialize_4(id0);
  }

  private native void ReleaseData_5();
  public void ReleaseData()
  {
    ReleaseData_5();
  }

  private native void DeepCopy_6(vtkAbstractImageInterpolator id0);
  public void DeepCopy(vtkAbstractImageInterpolator id0)
  {
    DeepCopy_6(id0);
  }

  private native void Update_7();
  public void Update()
  {
    Update_7();
  }

  private native double Interpolate_8(double id0,double id1,double id2,int id3);
  public double Interpolate(double id0,double id1,double id2,int id3)
  {
    return Interpolate_8(id0,id1,id2,id3);
  }

  private native void SetOutValue_9(double id0);
  public void SetOutValue(double id0)
  {
    SetOutValue_9(id0);
  }

  private native double GetOutValue_10();
  public double GetOutValue()
  {
    return GetOutValue_10();
  }

  private native void SetTolerance_11(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_11(id0);
  }

  private native double GetTolerance_12();
  public double GetTolerance()
  {
    return GetTolerance_12();
  }

  private native void SetComponentOffset_13(int id0);
  public void SetComponentOffset(int id0)
  {
    SetComponentOffset_13(id0);
  }

  private native int GetComponentOffset_14();
  public int GetComponentOffset()
  {
    return GetComponentOffset_14();
  }

  private native void SetComponentCount_15(int id0);
  public void SetComponentCount(int id0)
  {
    SetComponentCount_15(id0);
  }

  private native int GetComponentCount_16();
  public int GetComponentCount()
  {
    return GetComponentCount_16();
  }

  private native int ComputeNumberOfComponents_17(int id0);
  public int ComputeNumberOfComponents(int id0)
  {
    return ComputeNumberOfComponents_17(id0);
  }

  private native int GetNumberOfComponents_18();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_18();
  }

  private native boolean CheckBoundsIJK_19(double id0[]);
  public boolean CheckBoundsIJK(double id0[])
  {
    return CheckBoundsIJK_19(id0);
  }

  private native boolean CheckBoundsIJK_20(float id0[]);
  public boolean CheckBoundsIJK(float id0[])
  {
    return CheckBoundsIJK_20(id0);
  }

  private native void SetBorderModeToClamp_21();
  public void SetBorderModeToClamp()
  {
    SetBorderModeToClamp_21();
  }

  private native void SetBorderModeToRepeat_22();
  public void SetBorderModeToRepeat()
  {
    SetBorderModeToRepeat_22();
  }

  private native void SetBorderModeToMirror_23();
  public void SetBorderModeToMirror()
  {
    SetBorderModeToMirror_23();
  }

  private native byte[] GetBorderModeAsString_24();
  public String GetBorderModeAsString()
  {
    return new String(GetBorderModeAsString_24(), StandardCharsets.UTF_8);
  }

  private native void SetSlidingWindow_25(boolean id0);
  public void SetSlidingWindow(boolean id0)
  {
    SetSlidingWindow_25(id0);
  }

  private native void SlidingWindowOn_26();
  public void SlidingWindowOn()
  {
    SlidingWindowOn_26();
  }

  private native void SlidingWindowOff_27();
  public void SlidingWindowOff()
  {
    SlidingWindowOff_27();
  }

  private native boolean GetSlidingWindow_28();
  public boolean GetSlidingWindow()
  {
    return GetSlidingWindow_28();
  }

  private native void ComputeSupportSize_29(double id0[],int id1[]);
  public void ComputeSupportSize(double id0[],int id1[])
  {
    ComputeSupportSize_29(id0,id1);
  }

  private native boolean IsSeparable_30();
  public boolean IsSeparable()
  {
    return IsSeparable_30();
  }

  private native double[] GetSpacing_31();
  public double[] GetSpacing()
  {
    return GetSpacing_31();
  }

  private native double[] GetDirection_32();
  public double[] GetDirection()
  {
    return GetDirection_32();
  }

  private native double[] GetOrigin_33();
  public double[] GetOrigin()
  {
    return GetOrigin_33();
  }

  private native int[] GetExtent_34();
  public int[] GetExtent()
  {
    return GetExtent_34();
  }

  public vtkAbstractImageInterpolator() { super(); }

  public vtkAbstractImageInterpolator(long id) { super(id); }

}
