// java wrapper for vtkMNITransformWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMNITransformWriter extends vtkAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFileExtensions_6();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_7();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_7(), StandardCharsets.UTF_8);
  }

  private native void SetTransform_8(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_8(id0);
  }

  private native long GetTransform_9();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_9();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddTransform_10(vtkAbstractTransform id0);
  public void AddTransform(vtkAbstractTransform id0)
  {
    AddTransform_10(id0);
  }

  private native int GetNumberOfTransforms_11();
  public int GetNumberOfTransforms()
  {
    return GetNumberOfTransforms_11();
  }

  private native void SetComments_12(byte[] id0, int len0);
  public void SetComments(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetComments_12(bytes0, bytes0.length);
  }

  private native byte[] GetComments_13();
  public String GetComments()
  {
    return new String(GetComments_13(), StandardCharsets.UTF_8);
  }

  private native void Write_14();
  public void Write()
  {
    Write_14();
  }

  public vtkMNITransformWriter() { super(); }

  public vtkMNITransformWriter(long id) { super(id); }
  public native long   VTKInit();

}
