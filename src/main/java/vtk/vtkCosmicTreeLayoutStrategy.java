// java wrapper for vtkCosmicTreeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCosmicTreeLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void Layout_4();
  public void Layout()
  {
    Layout_4();
  }

  private native void SetSizeLeafNodesOnly_5(int id0);
  public void SetSizeLeafNodesOnly(int id0)
  {
    SetSizeLeafNodesOnly_5(id0);
  }

  private native int GetSizeLeafNodesOnly_6();
  public int GetSizeLeafNodesOnly()
  {
    return GetSizeLeafNodesOnly_6();
  }

  private native void SizeLeafNodesOnlyOn_7();
  public void SizeLeafNodesOnlyOn()
  {
    SizeLeafNodesOnlyOn_7();
  }

  private native void SizeLeafNodesOnlyOff_8();
  public void SizeLeafNodesOnlyOff()
  {
    SizeLeafNodesOnlyOff_8();
  }

  private native void SetLayoutDepth_9(int id0);
  public void SetLayoutDepth(int id0)
  {
    SetLayoutDepth_9(id0);
  }

  private native int GetLayoutDepth_10();
  public int GetLayoutDepth()
  {
    return GetLayoutDepth_10();
  }

  private native void SetLayoutRoot_11(long id0);
  public void SetLayoutRoot(long id0)
  {
    SetLayoutRoot_11(id0);
  }

  private native long GetLayoutRoot_12();
  public long GetLayoutRoot()
  {
    return GetLayoutRoot_12();
  }

  private native void SetNodeSizeArrayName_13(byte[] id0, int len0);
  public void SetNodeSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeSizeArrayName_13(bytes0, bytes0.length);
  }

  private native byte[] GetNodeSizeArrayName_14();
  public String GetNodeSizeArrayName()
  {
    return new String(GetNodeSizeArrayName_14(), StandardCharsets.UTF_8);
  }

  public vtkCosmicTreeLayoutStrategy() { super(); }

  public vtkCosmicTreeLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
