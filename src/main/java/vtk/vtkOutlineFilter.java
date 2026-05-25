// java wrapper for vtkOutlineFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOutlineFilter extends vtkPolyDataAlgorithm
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

  private native void SetGenerateFaces_4(int id0);
  public void SetGenerateFaces(int id0)
  {
    SetGenerateFaces_4(id0);
  }

  private native void GenerateFacesOn_5();
  public void GenerateFacesOn()
  {
    GenerateFacesOn_5();
  }

  private native void GenerateFacesOff_6();
  public void GenerateFacesOff()
  {
    GenerateFacesOff_6();
  }

  private native int GetGenerateFaces_7();
  public int GetGenerateFaces()
  {
    return GetGenerateFaces_7();
  }

  private native void SetCompositeStyle_8(int id0);
  public void SetCompositeStyle(int id0)
  {
    SetCompositeStyle_8(id0);
  }

  private native int GetCompositeStyle_9();
  public int GetCompositeStyle()
  {
    return GetCompositeStyle_9();
  }

  private native void SetCompositeStyleToRoot_10();
  public void SetCompositeStyleToRoot()
  {
    SetCompositeStyleToRoot_10();
  }

  private native void SetCompositeStyleToLeafs_11();
  public void SetCompositeStyleToLeafs()
  {
    SetCompositeStyleToLeafs_11();
  }

  private native void SetCompositeStyleToRootAndLeafs_12();
  public void SetCompositeStyleToRootAndLeafs()
  {
    SetCompositeStyleToRootAndLeafs_12();
  }

  private native void SetCompositeStyleToSpecifiedIndex_13();
  public void SetCompositeStyleToSpecifiedIndex()
  {
    SetCompositeStyleToSpecifiedIndex_13();
  }

  private native void AddIndex_14(int id0);
  public void AddIndex(int id0)
  {
    AddIndex_14(id0);
  }

  private native void RemoveIndex_15(int id0);
  public void RemoveIndex(int id0)
  {
    RemoveIndex_15(id0);
  }

  private native void RemoveAllIndices_16();
  public void RemoveAllIndices()
  {
    RemoveAllIndices_16();
  }

  private native void SetOutputPointsPrecision_17(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_17(id0);
  }

  private native int GetOutputPointsPrecision_18();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_18();
  }

  public vtkOutlineFilter() { super(); }

  public vtkOutlineFilter(long id) { super(id); }
  public native long   VTKInit();

}
