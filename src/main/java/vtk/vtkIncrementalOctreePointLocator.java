// java wrapper for vtkIncrementalOctreePointLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIncrementalOctreePointLocator extends vtkIncrementalPointLocator
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

  private native void SetMaxPointsPerLeaf_4(int id0);
  public void SetMaxPointsPerLeaf(int id0)
  {
    SetMaxPointsPerLeaf_4(id0);
  }

  private native int GetMaxPointsPerLeaf_5();
  public int GetMaxPointsPerLeaf()
  {
    return GetMaxPointsPerLeaf_5();
  }

  private native void SetBuildCubicOctree_6(int id0);
  public void SetBuildCubicOctree(int id0)
  {
    SetBuildCubicOctree_6(id0);
  }

  private native int GetBuildCubicOctree_7();
  public int GetBuildCubicOctree()
  {
    return GetBuildCubicOctree_7();
  }

  private native void BuildCubicOctreeOn_8();
  public void BuildCubicOctreeOn()
  {
    BuildCubicOctreeOn_8();
  }

  private native void BuildCubicOctreeOff_9();
  public void BuildCubicOctreeOff()
  {
    BuildCubicOctreeOff_9();
  }

  private native long GetLocatorPoints_10();
  public vtkPoints GetLocatorPoints()
  {
    long temp = GetLocatorPoints_10();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_11();
  public void Initialize()
  {
    Initialize_11();
  }

  private native void FreeSearchStructure_12();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_12();
  }

  private native int GetNumberOfPoints_13();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_13();
  }

  private native int GetNumberOfNodes_14();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_14();
  }

  private native long FindClosestInsertedPoint_15(double id0[]);
  public long FindClosestInsertedPoint(double id0[])
  {
    return FindClosestInsertedPoint_15(id0);
  }

  private native void GenerateRepresentation_16(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_16(id0,id1);
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

  private native long FindClosestPoint_19(double id0[]);
  public long FindClosestPoint(double id0[])
  {
    return FindClosestPoint_19(id0);
  }

  private native long FindClosestPoint_20(double id0,double id1,double id2);
  public long FindClosestPoint(double id0,double id1,double id2)
  {
    return FindClosestPoint_20(id0,id1,id2);
  }

  private native void FindPointsWithinRadius_21(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_21(id0,id1,id2);
  }

  private native void FindPointsWithinSquaredRadius_22(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinSquaredRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinSquaredRadius_22(id0,id1,id2);
  }

  private native void FindClosestNPoints_23(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_23(id0,id1,id2);
  }

  private native int InitPointInsertion_24(vtkPoints id0,double id1[]);
  public int InitPointInsertion(vtkPoints id0,double id1[])
  {
    return InitPointInsertion_24(id0,id1);
  }

  private native int InitPointInsertion_25(vtkPoints id0,double id1[],long id2);
  public int InitPointInsertion(vtkPoints id0,double id1[],long id2)
  {
    return InitPointInsertion_25(id0,id1,id2);
  }

  private native long IsInsertedPoint_26(double id0[]);
  public long IsInsertedPoint(double id0[])
  {
    return IsInsertedPoint_26(id0);
  }

  private native long IsInsertedPoint_27(double id0,double id1,double id2);
  public long IsInsertedPoint(double id0,double id1,double id2)
  {
    return IsInsertedPoint_27(id0,id1,id2);
  }

  private native void InsertPoint_28(long id0,double id1[]);
  public void InsertPoint(long id0,double id1[])
  {
    InsertPoint_28(id0,id1);
  }

  private native long InsertNextPoint_29(double id0[]);
  public long InsertNextPoint(double id0[])
  {
    return InsertNextPoint_29(id0);
  }

  private native long GetRoot_30();
  public vtkIncrementalOctreeNode GetRoot()
  {
    long temp = GetRoot_30();

    if (temp == 0) return null;
    return (vtkIncrementalOctreeNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfLevels_31();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_31();
  }

  public vtkIncrementalOctreePointLocator() { super(); }

  public vtkIncrementalOctreePointLocator(long id) { super(id); }
  public native long   VTKInit();

}
