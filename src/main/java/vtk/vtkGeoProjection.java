// java wrapper for vtkGeoProjection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeoProjection extends vtkObject
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

  private native int GetNumberOfProjections_4();
  public int GetNumberOfProjections()
  {
    return GetNumberOfProjections_4();
  }

  private native byte[] GetProjectionName_5(int id0);
  public String GetProjectionName(int id0)
  {
    return new String(GetProjectionName_5(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetProjectionDescription_6(int id0);
  public String GetProjectionDescription(int id0)
  {
    return new String(GetProjectionDescription_6(id0), StandardCharsets.UTF_8);
  }

  private native void SetName_7(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_7(bytes0, bytes0.length);
  }

  private native byte[] GetName_8();
  public String GetName()
  {
    return new String(GetName_8(), StandardCharsets.UTF_8);
  }

  private native int GetIndex_9();
  public int GetIndex()
  {
    return GetIndex_9();
  }

  private native byte[] GetDescription_10();
  public String GetDescription()
  {
    return new String(GetDescription_10(), StandardCharsets.UTF_8);
  }

  private native void SetCentralMeridian_11(double id0);
  public void SetCentralMeridian(double id0)
  {
    SetCentralMeridian_11(id0);
  }

  private native double GetCentralMeridian_12();
  public double GetCentralMeridian()
  {
    return GetCentralMeridian_12();
  }

  private native void SetOptionalParameter_13(byte[] id0, int len0,byte[] id1, int len1);
  public void SetOptionalParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetOptionalParameter_13(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void RemoveOptionalParameter_14(byte[] id0, int len0);
  public void RemoveOptionalParameter(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveOptionalParameter_14(bytes0, bytes0.length);
  }

  private native int GetNumberOfOptionalParameters_15();
  public int GetNumberOfOptionalParameters()
  {
    return GetNumberOfOptionalParameters_15();
  }

  private native byte[] GetOptionalParameterKey_16(int id0);
  public String GetOptionalParameterKey(int id0)
  {
    return new String(GetOptionalParameterKey_16(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetOptionalParameterValue_17(int id0);
  public String GetOptionalParameterValue(int id0)
  {
    return new String(GetOptionalParameterValue_17(id0), StandardCharsets.UTF_8);
  }

  private native void ClearOptionalParameters_18();
  public void ClearOptionalParameters()
  {
    ClearOptionalParameters_18();
  }

  private native void SetPROJ4String_19(byte[] id0, int len0);
  public void SetPROJ4String(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPROJ4String_19(bytes0, bytes0.length);
  }

  private native byte[] GetPROJ4String_20();
  public String GetPROJ4String()
  {
    return new String(GetPROJ4String_20(), StandardCharsets.UTF_8);
  }

  public vtkGeoProjection() { super(); }

  public vtkGeoProjection(long id) { super(id); }
  public native long   VTKInit();

}
