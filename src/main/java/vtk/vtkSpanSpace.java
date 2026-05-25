// java wrapper for vtkSpanSpace object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpanSpace extends vtkScalarTree
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

  private native void ShallowCopy_4(vtkScalarTree id0);
  public void ShallowCopy(vtkScalarTree id0)
  {
    ShallowCopy_4(id0);
  }

  private native void SetScalarRange_5(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_5(id0,id1);
  }

  private native void SetScalarRange_6(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_6(id0);
  }

  private native double[] GetScalarRange_7();
  public double[] GetScalarRange()
  {
    return GetScalarRange_7();
  }

  private native void SetComputeScalarRange_8(int id0);
  public void SetComputeScalarRange(int id0)
  {
    SetComputeScalarRange_8(id0);
  }

  private native int GetComputeScalarRange_9();
  public int GetComputeScalarRange()
  {
    return GetComputeScalarRange_9();
  }

  private native void ComputeScalarRangeOn_10();
  public void ComputeScalarRangeOn()
  {
    ComputeScalarRangeOn_10();
  }

  private native void ComputeScalarRangeOff_11();
  public void ComputeScalarRangeOff()
  {
    ComputeScalarRangeOff_11();
  }

  private native void SetResolution_12(long id0);
  public void SetResolution(long id0)
  {
    SetResolution_12(id0);
  }

  private native long GetResolutionMinValue_13();
  public long GetResolutionMinValue()
  {
    return GetResolutionMinValue_13();
  }

  private native long GetResolutionMaxValue_14();
  public long GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_14();
  }

  private native long GetResolution_15();
  public long GetResolution()
  {
    return GetResolution_15();
  }

  private native void SetComputeResolution_16(int id0);
  public void SetComputeResolution(int id0)
  {
    SetComputeResolution_16(id0);
  }

  private native int GetComputeResolution_17();
  public int GetComputeResolution()
  {
    return GetComputeResolution_17();
  }

  private native void ComputeResolutionOn_18();
  public void ComputeResolutionOn()
  {
    ComputeResolutionOn_18();
  }

  private native void ComputeResolutionOff_19();
  public void ComputeResolutionOff()
  {
    ComputeResolutionOff_19();
  }

  private native void SetNumberOfCellsPerBucket_20(int id0);
  public void SetNumberOfCellsPerBucket(int id0)
  {
    SetNumberOfCellsPerBucket_20(id0);
  }

  private native int GetNumberOfCellsPerBucketMinValue_21();
  public int GetNumberOfCellsPerBucketMinValue()
  {
    return GetNumberOfCellsPerBucketMinValue_21();
  }

  private native int GetNumberOfCellsPerBucketMaxValue_22();
  public int GetNumberOfCellsPerBucketMaxValue()
  {
    return GetNumberOfCellsPerBucketMaxValue_22();
  }

  private native int GetNumberOfCellsPerBucket_23();
  public int GetNumberOfCellsPerBucket()
  {
    return GetNumberOfCellsPerBucket_23();
  }

  private native void Initialize_24();
  public void Initialize()
  {
    Initialize_24();
  }

  private native void BuildTree_25();
  public void BuildTree()
  {
    BuildTree_25();
  }

  private native void InitTraversal_26(double id0);
  public void InitTraversal(double id0)
  {
    InitTraversal_26(id0);
  }

  private native long GetNumberOfCellBatches_27(double id0);
  public long GetNumberOfCellBatches(double id0)
  {
    return GetNumberOfCellBatches_27(id0);
  }

  private native void SetBatchSize_28(long id0);
  public void SetBatchSize(long id0)
  {
    SetBatchSize_28(id0);
  }

  private native long GetBatchSizeMinValue_29();
  public long GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_29();
  }

  private native long GetBatchSizeMaxValue_30();
  public long GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_30();
  }

  private native long GetBatchSize_31();
  public long GetBatchSize()
  {
    return GetBatchSize_31();
  }

  public vtkSpanSpace() { super(); }

  public vtkSpanSpace(long id) { super(id); }
  public native long   VTKInit();

}
