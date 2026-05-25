// java wrapper for vtkPointSetStreamer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetStreamer extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfPointsPerBucket_4(int id0);
  public void SetNumberOfPointsPerBucket(int id0)
  {
    SetNumberOfPointsPerBucket_4(id0);
  }

  private native int GetNumberOfPointsPerBucketMinValue_5();
  public int GetNumberOfPointsPerBucketMinValue()
  {
    return GetNumberOfPointsPerBucketMinValue_5();
  }

  private native int GetNumberOfPointsPerBucketMaxValue_6();
  public int GetNumberOfPointsPerBucketMaxValue()
  {
    return GetNumberOfPointsPerBucketMaxValue_6();
  }

  private native int GetNumberOfPointsPerBucket_7();
  public int GetNumberOfPointsPerBucket()
  {
    return GetNumberOfPointsPerBucket_7();
  }

  private native void SetBucketId_8(long id0);
  public void SetBucketId(long id0)
  {
    SetBucketId_8(id0);
  }

  private native long GetBucketIdMinValue_9();
  public long GetBucketIdMinValue()
  {
    return GetBucketIdMinValue_9();
  }

  private native long GetBucketIdMaxValue_10();
  public long GetBucketIdMaxValue()
  {
    return GetBucketIdMaxValue_10();
  }

  private native long GetBucketId_11();
  public long GetBucketId()
  {
    return GetBucketId_11();
  }

  private native long GetNumberOfBuckets_12();
  public long GetNumberOfBuckets()
  {
    return GetNumberOfBuckets_12();
  }

  private native void SetCreateVerticesCellArray_13(boolean id0);
  public void SetCreateVerticesCellArray(boolean id0)
  {
    SetCreateVerticesCellArray_13(id0);
  }

  private native boolean GetCreateVerticesCellArray_14();
  public boolean GetCreateVerticesCellArray()
  {
    return GetCreateVerticesCellArray_14();
  }

  private native void CreateVerticesCellArrayOn_15();
  public void CreateVerticesCellArrayOn()
  {
    CreateVerticesCellArrayOn_15();
  }

  private native void CreateVerticesCellArrayOff_16();
  public void CreateVerticesCellArrayOff()
  {
    CreateVerticesCellArrayOff_16();
  }

  public vtkPointSetStreamer() { super(); }

  public vtkPointSetStreamer(long id) { super(id); }
  public native long   VTKInit();

}
