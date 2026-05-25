// java wrapper for vtkStaticPointLocator2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStaticPointLocator2D extends vtkAbstractPointLocator
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

  private native void SetDivisions_8(int id0,int id1);
  public void SetDivisions(int id0,int id1)
  {
    SetDivisions_8(id0,id1);
  }

  private native void SetDivisions_9(int id0[]);
  public void SetDivisions(int id0[])
  {
    SetDivisions_9(id0);
  }

  private native int[] GetDivisions_10();
  public int[] GetDivisions()
  {
    return GetDivisions_10();
  }

  private native long FindClosestPoint_11(double id0[]);
  public long FindClosestPoint(double id0[])
  {
    return FindClosestPoint_11(id0);
  }

  private native void FindClosestNPoints_12(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_12(id0,id1,id2);
  }

  private native void FindPointsWithinRadius_13(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_13(id0,id1,id2);
  }

  private native double FindCloseNBoundedPoints_14(int id0,double id1[],vtkIdList id2);
  public double FindCloseNBoundedPoints(int id0,double id1[],vtkIdList id2)
  {
    return FindCloseNBoundedPoints_14(id0,id1,id2);
  }

  private native void Initialize_15();
  public void Initialize()
  {
    Initialize_15();
  }

  private native void FreeSearchStructure_16();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_16();
  }

  private native void BuildLocator_17();
  public void BuildLocator()
  {
    BuildLocator_17();
  }

  private native void ForceBuildLocator_18();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_18();
  }

  private native long GetNumberOfPointsInBucket_19(long id0);
  public long GetNumberOfPointsInBucket(long id0)
  {
    return GetNumberOfPointsInBucket_19(id0);
  }

  private native void GetBucketIds_20(long id0,vtkIdList id1);
  public void GetBucketIds(long id0,vtkIdList id1)
  {
    GetBucketIds_20(id0,id1);
  }

  private native void SetMaxNumberOfBuckets_21(long id0);
  public void SetMaxNumberOfBuckets(long id0)
  {
    SetMaxNumberOfBuckets_21(id0);
  }

  private native long GetMaxNumberOfBucketsMinValue_22();
  public long GetMaxNumberOfBucketsMinValue()
  {
    return GetMaxNumberOfBucketsMinValue_22();
  }

  private native long GetMaxNumberOfBucketsMaxValue_23();
  public long GetMaxNumberOfBucketsMaxValue()
  {
    return GetMaxNumberOfBucketsMaxValue_23();
  }

  private native long GetMaxNumberOfBuckets_24();
  public long GetMaxNumberOfBuckets()
  {
    return GetMaxNumberOfBuckets_24();
  }

  private native boolean GetLargeIds_25();
  public boolean GetLargeIds()
  {
    return GetLargeIds_25();
  }

  private native void GetSpacing_26(double id0[]);
  public void GetSpacing(double id0[])
  {
    GetSpacing_26(id0);
  }

  private native void GenerateRepresentation_27(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_27(id0,id1);
  }

  private native long FindClosestPoint_28(double id0,double id1,double id2);
  public long FindClosestPoint(double id0,double id1,double id2)
  {
    return FindClosestPoint_28(id0,id1,id2);
  }

  private native void FindClosestNPoints_29(int id0,double id1,double id2,double id3,vtkIdList id4);
  public void FindClosestNPoints(int id0,double id1,double id2,double id3,vtkIdList id4)
  {
    FindClosestNPoints_29(id0,id1,id2,id3,id4);
  }

  private native void FindPointsWithinRadius_30(double id0,double id1,double id2,double id3,vtkIdList id4);
  public void FindPointsWithinRadius(double id0,double id1,double id2,double id3,vtkIdList id4)
  {
    FindPointsWithinRadius_30(id0,id1,id2,id3,id4);
  }

  public vtkStaticPointLocator2D() { super(); }

  public vtkStaticPointLocator2D(long id) { super(id); }
  public native long   VTKInit();

}
