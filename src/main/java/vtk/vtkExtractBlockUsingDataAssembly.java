// java wrapper for vtkExtractBlockUsingDataAssembly object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractBlockUsingDataAssembly extends vtkCompositeDataSetAlgorithm
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

  private native boolean AddSelector_4(byte[] id0, int len0);
  public boolean AddSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddSelector_4(bytes0, bytes0.length);
  }

  private native void ClearSelectors_5();
  public void ClearSelectors()
  {
    ClearSelectors_5();
  }

  private native void SetSelector_6(byte[] id0, int len0);
  public void SetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelector_6(bytes0, bytes0.length);
  }

  private native int GetNumberOfSelectors_7();
  public int GetNumberOfSelectors()
  {
    return GetNumberOfSelectors_7();
  }

  private native byte[] GetSelector_8(int id0);
  public String GetSelector(int id0)
  {
    return new String(GetSelector_8(id0), StandardCharsets.UTF_8);
  }

  private native void SetAssemblyName_9(byte[] id0, int len0);
  public void SetAssemblyName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAssemblyName_9(bytes0, bytes0.length);
  }

  private native byte[] GetAssemblyName_10();
  public String GetAssemblyName()
  {
    return new String(GetAssemblyName_10(), StandardCharsets.UTF_8);
  }

  private native void SetSelectSubtrees_11(boolean id0);
  public void SetSelectSubtrees(boolean id0)
  {
    SetSelectSubtrees_11(id0);
  }

  private native boolean GetSelectSubtrees_12();
  public boolean GetSelectSubtrees()
  {
    return GetSelectSubtrees_12();
  }

  private native void SelectSubtreesOn_13();
  public void SelectSubtreesOn()
  {
    SelectSubtreesOn_13();
  }

  private native void SelectSubtreesOff_14();
  public void SelectSubtreesOff()
  {
    SelectSubtreesOff_14();
  }

  private native void SetPruneDataAssembly_15(boolean id0);
  public void SetPruneDataAssembly(boolean id0)
  {
    SetPruneDataAssembly_15(id0);
  }

  private native boolean GetPruneDataAssembly_16();
  public boolean GetPruneDataAssembly()
  {
    return GetPruneDataAssembly_16();
  }

  private native void PruneDataAssemblyOn_17();
  public void PruneDataAssemblyOn()
  {
    PruneDataAssemblyOn_17();
  }

  private native void PruneDataAssemblyOff_18();
  public void PruneDataAssemblyOff()
  {
    PruneDataAssemblyOff_18();
  }

  public vtkExtractBlockUsingDataAssembly() { super(); }

  public vtkExtractBlockUsingDataAssembly(long id) { super(id); }
  public native long   VTKInit();

}
