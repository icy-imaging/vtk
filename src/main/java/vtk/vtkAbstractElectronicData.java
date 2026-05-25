// java wrapper for vtkAbstractElectronicData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractElectronicData extends vtkDataObject
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native long GetNumberOfMOs_5();
  public long GetNumberOfMOs()
  {
    return GetNumberOfMOs_5();
  }

  private native long GetNumberOfElectrons_6();
  public long GetNumberOfElectrons()
  {
    return GetNumberOfElectrons_6();
  }

  private native long GetMO_7(long id0);
  public vtkImageData GetMO(long id0)
  {
    long temp = GetMO_7(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElectronDensity_8();
  public vtkImageData GetElectronDensity()
  {
    long temp = GetElectronDensity_8();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHOMO_9();
  public vtkImageData GetHOMO()
  {
    long temp = GetHOMO_9();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLUMO_10();
  public vtkImageData GetLUMO()
  {
    long temp = GetLUMO_10();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHOMOOrbitalNumber_11();
  public long GetHOMOOrbitalNumber()
  {
    return GetHOMOOrbitalNumber_11();
  }

  private native long GetLUMOOrbitalNumber_12();
  public long GetLUMOOrbitalNumber()
  {
    return GetLUMOOrbitalNumber_12();
  }

  private native boolean IsHOMO_13(long id0);
  public boolean IsHOMO(long id0)
  {
    return IsHOMO_13(id0);
  }

  private native boolean IsLUMO_14(long id0);
  public boolean IsLUMO(long id0)
  {
    return IsLUMO_14(id0);
  }

  private native void DeepCopy_15(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_15(id0);
  }

  private native double GetPadding_16();
  public double GetPadding()
  {
    return GetPadding_16();
  }

  public vtkAbstractElectronicData() { super(); }

  public vtkAbstractElectronicData(long id) { super(id); }

}
