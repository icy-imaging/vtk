// java wrapper for vtkSTLReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSTLReader extends vtkAbstractPolyDataReader
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetMerging_5(int id0);
  public void SetMerging(int id0)
  {
    SetMerging_5(id0);
  }

  private native int GetMerging_6();
  public int GetMerging()
  {
    return GetMerging_6();
  }

  private native void MergingOn_7();
  public void MergingOn()
  {
    MergingOn_7();
  }

  private native void MergingOff_8();
  public void MergingOff()
  {
    MergingOff_8();
  }

  private native void SetScalarTags_9(int id0);
  public void SetScalarTags(int id0)
  {
    SetScalarTags_9(id0);
  }

  private native int GetScalarTags_10();
  public int GetScalarTags()
  {
    return GetScalarTags_10();
  }

  private native void ScalarTagsOn_11();
  public void ScalarTagsOn()
  {
    ScalarTagsOn_11();
  }

  private native void ScalarTagsOff_12();
  public void ScalarTagsOff()
  {
    ScalarTagsOff_12();
  }

  private native void SetLocator_13(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_13(id0);
  }

  private native long GetLocator_14();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_14();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetHeader_15();
  public String GetHeader()
  {
    return new String(GetHeader_15(), StandardCharsets.UTF_8);
  }

  private native long GetBinaryHeader_16();
  public vtkUnsignedCharArray GetBinaryHeader()
  {
    long temp = GetBinaryHeader_16();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSTLReader() { super(); }

  public vtkSTLReader(long id) { super(id); }
  public native long   VTKInit();

}
