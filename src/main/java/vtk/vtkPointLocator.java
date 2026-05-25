// java wrapper for vtkPointLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointLocator extends vtkIncrementalPointLocator
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

  private native void SetDivisions_4(int id0,int id1,int id2);
  public void SetDivisions(int id0,int id1,int id2)
  {
    SetDivisions_4(id0,id1,id2);
  }

  private native void SetDivisions_5(int id0[]);
  public void SetDivisions(int id0[])
  {
    SetDivisions_5(id0);
  }

  private native int[] GetDivisions_6();
  public int[] GetDivisions()
  {
    return GetDivisions_6();
  }

  private native void SetNumberOfPointsPerBucket_7(int id0);
  public void SetNumberOfPointsPerBucket(int id0)
  {
    SetNumberOfPointsPerBucket_7(id0);
  }

  private native int GetNumberOfPointsPerBucketMinValue_8();
  public int GetNumberOfPointsPerBucketMinValue()
  {
    return GetNumberOfPointsPerBucketMinValue_8();
  }

  private native int GetNumberOfPointsPerBucketMaxValue_9();
  public int GetNumberOfPointsPerBucketMaxValue()
  {
    return GetNumberOfPointsPerBucketMaxValue_9();
  }

  private native int GetNumberOfPointsPerBucket_10();
  public int GetNumberOfPointsPerBucket()
  {
    return GetNumberOfPointsPerBucket_10();
  }

  private native long FindClosestPoint_11(double id0[]);
  public long FindClosestPoint(double id0[])
  {
    return FindClosestPoint_11(id0);
  }

  private native int InitPointInsertion_12(vtkPoints id0,double id1[]);
  public int InitPointInsertion(vtkPoints id0,double id1[])
  {
    return InitPointInsertion_12(id0,id1);
  }

  private native int InitPointInsertion_13(vtkPoints id0,double id1[],long id2);
  public int InitPointInsertion(vtkPoints id0,double id1[],long id2)
  {
    return InitPointInsertion_13(id0,id1,id2);
  }

  private native void InsertPoint_14(long id0,double id1[]);
  public void InsertPoint(long id0,double id1[])
  {
    InsertPoint_14(id0,id1);
  }

  private native long InsertNextPoint_15(double id0[]);
  public long InsertNextPoint(double id0[])
  {
    return InsertNextPoint_15(id0);
  }

  private native long IsInsertedPoint_16(double id0,double id1,double id2);
  public long IsInsertedPoint(double id0,double id1,double id2)
  {
    return IsInsertedPoint_16(id0,id1,id2);
  }

  private native long IsInsertedPoint_17(double id0[]);
  public long IsInsertedPoint(double id0[])
  {
    return IsInsertedPoint_17(id0);
  }

  private native long FindClosestInsertedPoint_18(double id0[]);
  public long FindClosestInsertedPoint(double id0[])
  {
    return FindClosestInsertedPoint_18(id0);
  }

  private native void FindClosestNPoints_19(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_19(id0,id1,id2);
  }

  private native void FindDistributedPoints_20(int id0,double id1[],vtkIdList id2,int id3);
  public void FindDistributedPoints(int id0,double id1[],vtkIdList id2,int id3)
  {
    FindDistributedPoints_20(id0,id1,id2,id3);
  }

  private native void FindDistributedPoints_21(int id0,double id1,double id2,double id3,vtkIdList id4,int id5);
  public void FindDistributedPoints(int id0,double id1,double id2,double id3,vtkIdList id4,int id5)
  {
    FindDistributedPoints_21(id0,id1,id2,id3,id4,id5);
  }

  private native void FindPointsWithinRadius_22(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_22(id0,id1,id2);
  }

  private native long GetPointsInBucket_23(double id0[],int id1[]);
  public vtkIdList GetPointsInBucket(double id0[],int id1[])
  {
    long temp = GetPointsInBucket_23(id0,id1);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoints_24();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_24();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_25();
  public void Initialize()
  {
    Initialize_25();
  }

  private native void FreeSearchStructure_26();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_26();
  }

  private native void BuildLocator_27();
  public void BuildLocator()
  {
    BuildLocator_27();
  }

  private native void ForceBuildLocator_28();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_28();
  }

  private native void GenerateRepresentation_29(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_29(id0,id1);
  }

  private native long FindClosestPoint_30(double id0,double id1,double id2);
  public long FindClosestPoint(double id0,double id1,double id2)
  {
    return FindClosestPoint_30(id0,id1,id2);
  }

  public vtkPointLocator() { super(); }

  public vtkPointLocator(long id) { super(id); }
  public native long   VTKInit();

}
