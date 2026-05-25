// java wrapper for vtkMergeTables object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeTables extends vtkTableAlgorithm
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

  private native void SetFirstTablePrefix_4(byte[] id0, int len0);
  public void SetFirstTablePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFirstTablePrefix_4(bytes0, bytes0.length);
  }

  private native byte[] GetFirstTablePrefix_5();
  public String GetFirstTablePrefix()
  {
    return new String(GetFirstTablePrefix_5(), StandardCharsets.UTF_8);
  }

  private native void SetSecondTablePrefix_6(byte[] id0, int len0);
  public void SetSecondTablePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSecondTablePrefix_6(bytes0, bytes0.length);
  }

  private native byte[] GetSecondTablePrefix_7();
  public String GetSecondTablePrefix()
  {
    return new String(GetSecondTablePrefix_7(), StandardCharsets.UTF_8);
  }

  private native void SetMergeColumnsByName_8(boolean id0);
  public void SetMergeColumnsByName(boolean id0)
  {
    SetMergeColumnsByName_8(id0);
  }

  private native boolean GetMergeColumnsByName_9();
  public boolean GetMergeColumnsByName()
  {
    return GetMergeColumnsByName_9();
  }

  private native void MergeColumnsByNameOn_10();
  public void MergeColumnsByNameOn()
  {
    MergeColumnsByNameOn_10();
  }

  private native void MergeColumnsByNameOff_11();
  public void MergeColumnsByNameOff()
  {
    MergeColumnsByNameOff_11();
  }

  private native void SetPrefixAllButMerged_12(boolean id0);
  public void SetPrefixAllButMerged(boolean id0)
  {
    SetPrefixAllButMerged_12(id0);
  }

  private native boolean GetPrefixAllButMerged_13();
  public boolean GetPrefixAllButMerged()
  {
    return GetPrefixAllButMerged_13();
  }

  private native void PrefixAllButMergedOn_14();
  public void PrefixAllButMergedOn()
  {
    PrefixAllButMergedOn_14();
  }

  private native void PrefixAllButMergedOff_15();
  public void PrefixAllButMergedOff()
  {
    PrefixAllButMergedOff_15();
  }

  public vtkMergeTables() { super(); }

  public vtkMergeTables(long id) { super(id); }
  public native long   VTKInit();

}
