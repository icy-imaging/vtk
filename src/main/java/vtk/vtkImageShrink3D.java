// java wrapper for vtkImageShrink3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageShrink3D extends vtkThreadedImageAlgorithm
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

  private native void SetShrinkFactors_4(int id0,int id1,int id2);
  public void SetShrinkFactors(int id0,int id1,int id2)
  {
    SetShrinkFactors_4(id0,id1,id2);
  }

  private native void SetShrinkFactors_5(int id0[]);
  public void SetShrinkFactors(int id0[])
  {
    SetShrinkFactors_5(id0);
  }

  private native int[] GetShrinkFactors_6();
  public int[] GetShrinkFactors()
  {
    return GetShrinkFactors_6();
  }

  private native void SetShift_7(int id0,int id1,int id2);
  public void SetShift(int id0,int id1,int id2)
  {
    SetShift_7(id0,id1,id2);
  }

  private native void SetShift_8(int id0[]);
  public void SetShift(int id0[])
  {
    SetShift_8(id0);
  }

  private native int[] GetShift_9();
  public int[] GetShift()
  {
    return GetShift_9();
  }

  private native void SetAveraging_10(int id0);
  public void SetAveraging(int id0)
  {
    SetAveraging_10(id0);
  }

  private native int GetAveraging_11();
  public int GetAveraging()
  {
    return GetAveraging_11();
  }

  private native void AveragingOn_12();
  public void AveragingOn()
  {
    AveragingOn_12();
  }

  private native void AveragingOff_13();
  public void AveragingOff()
  {
    AveragingOff_13();
  }

  private native void SetMean_14(int id0);
  public void SetMean(int id0)
  {
    SetMean_14(id0);
  }

  private native int GetMean_15();
  public int GetMean()
  {
    return GetMean_15();
  }

  private native void MeanOn_16();
  public void MeanOn()
  {
    MeanOn_16();
  }

  private native void MeanOff_17();
  public void MeanOff()
  {
    MeanOff_17();
  }

  private native void SetMinimum_18(int id0);
  public void SetMinimum(int id0)
  {
    SetMinimum_18(id0);
  }

  private native int GetMinimum_19();
  public int GetMinimum()
  {
    return GetMinimum_19();
  }

  private native void MinimumOn_20();
  public void MinimumOn()
  {
    MinimumOn_20();
  }

  private native void MinimumOff_21();
  public void MinimumOff()
  {
    MinimumOff_21();
  }

  private native void SetMaximum_22(int id0);
  public void SetMaximum(int id0)
  {
    SetMaximum_22(id0);
  }

  private native int GetMaximum_23();
  public int GetMaximum()
  {
    return GetMaximum_23();
  }

  private native void MaximumOn_24();
  public void MaximumOn()
  {
    MaximumOn_24();
  }

  private native void MaximumOff_25();
  public void MaximumOff()
  {
    MaximumOff_25();
  }

  private native void SetMedian_26(int id0);
  public void SetMedian(int id0)
  {
    SetMedian_26(id0);
  }

  private native int GetMedian_27();
  public int GetMedian()
  {
    return GetMedian_27();
  }

  private native void MedianOn_28();
  public void MedianOn()
  {
    MedianOn_28();
  }

  private native void MedianOff_29();
  public void MedianOff()
  {
    MedianOff_29();
  }

  public vtkImageShrink3D() { super(); }

  public vtkImageShrink3D(long id) { super(id); }
  public native long   VTKInit();

}
