// java wrapper for vtkSortFileNames object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSortFileNames extends vtkObject
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

  private native void SetGrouping_4(int id0);
  public void SetGrouping(int id0)
  {
    SetGrouping_4(id0);
  }

  private native int GetGrouping_5();
  public int GetGrouping()
  {
    return GetGrouping_5();
  }

  private native void GroupingOn_6();
  public void GroupingOn()
  {
    GroupingOn_6();
  }

  private native void GroupingOff_7();
  public void GroupingOff()
  {
    GroupingOff_7();
  }

  private native void SetNumericSort_8(int id0);
  public void SetNumericSort(int id0)
  {
    SetNumericSort_8(id0);
  }

  private native int GetNumericSort_9();
  public int GetNumericSort()
  {
    return GetNumericSort_9();
  }

  private native void NumericSortOn_10();
  public void NumericSortOn()
  {
    NumericSortOn_10();
  }

  private native void NumericSortOff_11();
  public void NumericSortOff()
  {
    NumericSortOff_11();
  }

  private native void SetIgnoreCase_12(int id0);
  public void SetIgnoreCase(int id0)
  {
    SetIgnoreCase_12(id0);
  }

  private native int GetIgnoreCase_13();
  public int GetIgnoreCase()
  {
    return GetIgnoreCase_13();
  }

  private native void IgnoreCaseOn_14();
  public void IgnoreCaseOn()
  {
    IgnoreCaseOn_14();
  }

  private native void IgnoreCaseOff_15();
  public void IgnoreCaseOff()
  {
    IgnoreCaseOff_15();
  }

  private native void SetSkipDirectories_16(int id0);
  public void SetSkipDirectories(int id0)
  {
    SetSkipDirectories_16(id0);
  }

  private native int GetSkipDirectories_17();
  public int GetSkipDirectories()
  {
    return GetSkipDirectories_17();
  }

  private native void SkipDirectoriesOn_18();
  public void SkipDirectoriesOn()
  {
    SkipDirectoriesOn_18();
  }

  private native void SkipDirectoriesOff_19();
  public void SkipDirectoriesOff()
  {
    SkipDirectoriesOff_19();
  }

  private native void SetInputFileNames_20(vtkStringArray id0);
  public void SetInputFileNames(vtkStringArray id0)
  {
    SetInputFileNames_20(id0);
  }

  private native long GetInputFileNames_21();
  public vtkStringArray GetInputFileNames()
  {
    long temp = GetInputFileNames_21();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFileNames_22();
  public vtkStringArray GetFileNames()
  {
    long temp = GetFileNames_22();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfGroups_23();
  public int GetNumberOfGroups()
  {
    return GetNumberOfGroups_23();
  }

  private native long GetNthGroup_24(int id0);
  public vtkStringArray GetNthGroup(int id0)
  {
    long temp = GetNthGroup_24(id0);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_25();
  public void Update()
  {
    Update_25();
  }

  public vtkSortFileNames() { super(); }

  public vtkSortFileNames(long id) { super(id); }
  public native long   VTKInit();

}
