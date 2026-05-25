// java wrapper for vtkIncrementalOctreeNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIncrementalOctreeNode extends vtkObject
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

  private native int GetNumberOfPoints_4();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_4();
  }

  private native long GetPointIdSet_5();
  public vtkIdList GetPointIdSet()
  {
    long temp = GetPointIdSet_5();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeleteChildNodes_6();
  public void DeleteChildNodes()
  {
    DeleteChildNodes_6();
  }

  private native void SetBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void GetBounds_8(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_8(id0);
  }

  private native double[] GetMinBounds_9();
  public double[] GetMinBounds()
  {
    return GetMinBounds_9();
  }

  private native double[] GetMaxBounds_10();
  public double[] GetMaxBounds()
  {
    return GetMaxBounds_10();
  }

  private native int IsLeaf_11();
  public int IsLeaf()
  {
    return IsLeaf_11();
  }

  private native int GetChildIndex_12(double id0[]);
  public int GetChildIndex(double id0[])
  {
    return GetChildIndex_12(id0);
  }

  private native long GetChild_13(int id0);
  public vtkIncrementalOctreeNode GetChild(int id0)
  {
    long temp = GetChild_13(id0);

    if (temp == 0) return null;
    return (vtkIncrementalOctreeNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int ContainsPoint_14(double id0[]);
  public int ContainsPoint(double id0[])
  {
    return ContainsPoint_14(id0);
  }

  private native int ContainsPointByData_15(double id0[]);
  public int ContainsPointByData(double id0[])
  {
    return ContainsPointByData_15(id0);
  }

  private native double GetDistance2ToInnerBoundary_16(double id0[],vtkIncrementalOctreeNode id1);
  public double GetDistance2ToInnerBoundary(double id0[],vtkIncrementalOctreeNode id1)
  {
    return GetDistance2ToInnerBoundary_16(id0,id1);
  }

  private native double GetDistance2ToBoundary_17(double id0[],vtkIncrementalOctreeNode id1,int id2);
  public double GetDistance2ToBoundary(double id0[],vtkIncrementalOctreeNode id1,int id2)
  {
    return GetDistance2ToBoundary_17(id0,id1,id2);
  }

  private native double GetDistance2ToBoundary_18(double id0[],double id1[],vtkIncrementalOctreeNode id2,int id3);
  public double GetDistance2ToBoundary(double id0[],double id1[],vtkIncrementalOctreeNode id2,int id3)
  {
    return GetDistance2ToBoundary_18(id0,id1,id2,id3);
  }

  private native void ExportAllPointIdsByInsertion_19(vtkIdList id0);
  public void ExportAllPointIdsByInsertion(vtkIdList id0)
  {
    ExportAllPointIdsByInsertion_19(id0);
  }

  private native int GetNumberOfLevels_20();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_20();
  }

  private native int GetID_21();
  public int GetID()
  {
    return GetID_21();
  }

  private native long GetPointIds_22();
  public vtkIdList GetPointIds()
  {
    long temp = GetPointIds_22();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIncrementalOctreeNode() { super(); }

  public vtkIncrementalOctreeNode(long id) { super(id); }
  public native long   VTKInit();

}
