// java wrapper for vtkSliceCubes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSliceCubes extends vtkObject
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

  private native void Write_4();
  public void Write()
  {
    Write_4();
  }

  private native void Update_5();
  public void Update()
  {
    Update_5();
  }

  private native void SetReader_6(vtkVolumeReader id0);
  public void SetReader(vtkVolumeReader id0)
  {
    SetReader_6(id0);
  }

  private native long GetReader_7();
  public vtkVolumeReader GetReader()
  {
    long temp = GetReader_7();

    if (temp == 0) return null;
    return (vtkVolumeReader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetValue_10(double id0);
  public void SetValue(double id0)
  {
    SetValue_10(id0);
  }

  private native double GetValue_11();
  public double GetValue()
  {
    return GetValue_11();
  }

  private native void SetLimitsFileName_12(byte[] id0, int len0);
  public void SetLimitsFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLimitsFileName_12(bytes0, bytes0.length);
  }

  private native byte[] GetLimitsFileName_13();
  public String GetLimitsFileName()
  {
    return new String(GetLimitsFileName_13(), StandardCharsets.UTF_8);
  }

  public vtkSliceCubes() { super(); }

  public vtkSliceCubes(long id) { super(id); }
  public native long   VTKInit();

}
