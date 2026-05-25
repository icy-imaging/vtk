// java wrapper for vtkSMPMergePoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSMPMergePoints extends vtkMergePoints
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

  private native void InitializeMerge_4();
  public void InitializeMerge()
  {
    InitializeMerge_4();
  }

  private native void Merge_5(vtkSMPMergePoints id0,long id1,vtkPointData id2,vtkPointData id3,vtkIdList id4);
  public void Merge(vtkSMPMergePoints id0,long id1,vtkPointData id2,vtkPointData id3,vtkIdList id4)
  {
    Merge_5(id0,id1,id2,id3,id4);
  }

  private native void FixSizeOfPointArray_6();
  public void FixSizeOfPointArray()
  {
    FixSizeOfPointArray_6();
  }

  private native long GetMaxId_7();
  public long GetMaxId()
  {
    return GetMaxId_7();
  }

  private native long GetNumberOfIdsInBucket_8(long id0);
  public long GetNumberOfIdsInBucket(long id0)
  {
    return GetNumberOfIdsInBucket_8(id0);
  }

  private native long GetNumberOfBuckets_9();
  public long GetNumberOfBuckets()
  {
    return GetNumberOfBuckets_9();
  }

  public vtkSMPMergePoints() { super(); }

  public vtkSMPMergePoints(long id) { super(id); }
  public native long   VTKInit();

}
