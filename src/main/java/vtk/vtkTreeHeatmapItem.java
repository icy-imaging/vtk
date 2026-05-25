// java wrapper for vtkTreeHeatmapItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeHeatmapItem extends vtkContextItem
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

  private native void SetTree_4(vtkTree id0);
  public void SetTree(vtkTree id0)
  {
    SetTree_4(id0);
  }

  private native long GetTree_5();
  public vtkTree GetTree()
  {
    long temp = GetTree_5();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColumnTree_6(vtkTree id0);
  public void SetColumnTree(vtkTree id0)
  {
    SetColumnTree_6(id0);
  }

  private native long GetColumnTree_7();
  public vtkTree GetColumnTree()
  {
    long temp = GetColumnTree_7();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTable_8(vtkTable id0);
  public void SetTable(vtkTable id0)
  {
    SetTable_8(id0);
  }

  private native long GetTable_9();
  public vtkTable GetTable()
  {
    long temp = GetTable_9();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDendrogram_10();
  public vtkDendrogramItem GetDendrogram()
  {
    long temp = GetDendrogram_10();

    if (temp == 0) return null;
    return (vtkDendrogramItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDendrogram_11(vtkDendrogramItem id0);
  public void SetDendrogram(vtkDendrogramItem id0)
  {
    SetDendrogram_11(id0);
  }

  private native long GetHeatmap_12();
  public vtkHeatmapItem GetHeatmap()
  {
    long temp = GetHeatmap_12();

    if (temp == 0) return null;
    return (vtkHeatmapItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHeatmap_13(vtkHeatmapItem id0);
  public void SetHeatmap(vtkHeatmapItem id0)
  {
    SetHeatmap_13(id0);
  }

  private native void ReorderTable_14();
  public void ReorderTable()
  {
    ReorderTable_14();
  }

  private native void ReverseTableRows_15();
  public void ReverseTableRows()
  {
    ReverseTableRows_15();
  }

  private native void ReverseTableColumns_16();
  public void ReverseTableColumns()
  {
    ReverseTableColumns_16();
  }

  private native void SetOrientation_17(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_17(id0);
  }

  private native int GetOrientation_18();
  public int GetOrientation()
  {
    return GetOrientation_18();
  }

  private native void GetBounds_19(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_19(id0);
  }

  private native void GetCenter_20(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_20(id0);
  }

  private native void GetSize_21(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_21(id0);
  }

  private native void CollapseToNumberOfLeafNodes_22(int id0);
  public void CollapseToNumberOfLeafNodes(int id0)
  {
    CollapseToNumberOfLeafNodes_22(id0);
  }

  private native float GetTreeLineWidth_23();
  public float GetTreeLineWidth()
  {
    return GetTreeLineWidth_23();
  }

  private native void SetTreeLineWidth_24(float id0);
  public void SetTreeLineWidth(float id0)
  {
    SetTreeLineWidth_24(id0);
  }

  private native long GetPrunedTree_25();
  public vtkTree GetPrunedTree()
  {
    long temp = GetPrunedTree_25();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTreeColorArray_26(byte[] id0, int len0);
  public void SetTreeColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTreeColorArray_26(bytes0, bytes0.length);
  }

  public vtkTreeHeatmapItem() { super(); }

  public vtkTreeHeatmapItem(long id) { super(id); }
  public native long   VTKInit();

}
