// java wrapper for vtkCollapseVerticesByArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCollapseVerticesByArray extends vtkGraphAlgorithm
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

  private native boolean GetAllowSelfLoops_4();
  public boolean GetAllowSelfLoops()
  {
    return GetAllowSelfLoops_4();
  }

  private native void SetAllowSelfLoops_5(boolean id0);
  public void SetAllowSelfLoops(boolean id0)
  {
    SetAllowSelfLoops_5(id0);
  }

  private native void AllowSelfLoopsOn_6();
  public void AllowSelfLoopsOn()
  {
    AllowSelfLoopsOn_6();
  }

  private native void AllowSelfLoopsOff_7();
  public void AllowSelfLoopsOff()
  {
    AllowSelfLoopsOff_7();
  }

  private native void AddAggregateEdgeArray_8(byte[] id0, int len0);
  public void AddAggregateEdgeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddAggregateEdgeArray_8(bytes0, bytes0.length);
  }

  private native void ClearAggregateEdgeArray_9();
  public void ClearAggregateEdgeArray()
  {
    ClearAggregateEdgeArray_9();
  }

  private native byte[] GetVertexArray_10();
  public String GetVertexArray()
  {
    return new String(GetVertexArray_10(), StandardCharsets.UTF_8);
  }

  private native void SetVertexArray_11(byte[] id0, int len0);
  public void SetVertexArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexArray_11(bytes0, bytes0.length);
  }

  private native boolean GetCountEdgesCollapsed_12();
  public boolean GetCountEdgesCollapsed()
  {
    return GetCountEdgesCollapsed_12();
  }

  private native void SetCountEdgesCollapsed_13(boolean id0);
  public void SetCountEdgesCollapsed(boolean id0)
  {
    SetCountEdgesCollapsed_13(id0);
  }

  private native void CountEdgesCollapsedOn_14();
  public void CountEdgesCollapsedOn()
  {
    CountEdgesCollapsedOn_14();
  }

  private native void CountEdgesCollapsedOff_15();
  public void CountEdgesCollapsedOff()
  {
    CountEdgesCollapsedOff_15();
  }

  private native byte[] GetEdgesCollapsedArray_16();
  public String GetEdgesCollapsedArray()
  {
    return new String(GetEdgesCollapsedArray_16(), StandardCharsets.UTF_8);
  }

  private native void SetEdgesCollapsedArray_17(byte[] id0, int len0);
  public void SetEdgesCollapsedArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgesCollapsedArray_17(bytes0, bytes0.length);
  }

  private native boolean GetCountVerticesCollapsed_18();
  public boolean GetCountVerticesCollapsed()
  {
    return GetCountVerticesCollapsed_18();
  }

  private native void SetCountVerticesCollapsed_19(boolean id0);
  public void SetCountVerticesCollapsed(boolean id0)
  {
    SetCountVerticesCollapsed_19(id0);
  }

  private native void CountVerticesCollapsedOn_20();
  public void CountVerticesCollapsedOn()
  {
    CountVerticesCollapsedOn_20();
  }

  private native void CountVerticesCollapsedOff_21();
  public void CountVerticesCollapsedOff()
  {
    CountVerticesCollapsedOff_21();
  }

  private native byte[] GetVerticesCollapsedArray_22();
  public String GetVerticesCollapsedArray()
  {
    return new String(GetVerticesCollapsedArray_22(), StandardCharsets.UTF_8);
  }

  private native void SetVerticesCollapsedArray_23(byte[] id0, int len0);
  public void SetVerticesCollapsedArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVerticesCollapsedArray_23(bytes0, bytes0.length);
  }

  public vtkCollapseVerticesByArray() { super(); }

  public vtkCollapseVerticesByArray(long id) { super(id); }
  public native long   VTKInit();

}
