// java wrapper for vtkXMLTreeReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLTreeReader extends vtkTreeAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetXMLString_6();
  public String GetXMLString()
  {
    return new String(GetXMLString_6(), StandardCharsets.UTF_8);
  }

  private native void SetXMLString_7(byte[] id0, int len0);
  public void SetXMLString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXMLString_7(bytes0, bytes0.length);
  }

  private native byte[] GetEdgePedigreeIdArrayName_8();
  public String GetEdgePedigreeIdArrayName()
  {
    return new String(GetEdgePedigreeIdArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetEdgePedigreeIdArrayName_9(byte[] id0, int len0);
  public void SetEdgePedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgePedigreeIdArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetVertexPedigreeIdArrayName_10();
  public String GetVertexPedigreeIdArrayName()
  {
    return new String(GetVertexPedigreeIdArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetVertexPedigreeIdArrayName_11(byte[] id0, int len0);
  public void SetVertexPedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexPedigreeIdArrayName_11(bytes0, bytes0.length);
  }

  private native void SetGenerateEdgePedigreeIds_12(boolean id0);
  public void SetGenerateEdgePedigreeIds(boolean id0)
  {
    SetGenerateEdgePedigreeIds_12(id0);
  }

  private native boolean GetGenerateEdgePedigreeIds_13();
  public boolean GetGenerateEdgePedigreeIds()
  {
    return GetGenerateEdgePedigreeIds_13();
  }

  private native void GenerateEdgePedigreeIdsOn_14();
  public void GenerateEdgePedigreeIdsOn()
  {
    GenerateEdgePedigreeIdsOn_14();
  }

  private native void GenerateEdgePedigreeIdsOff_15();
  public void GenerateEdgePedigreeIdsOff()
  {
    GenerateEdgePedigreeIdsOff_15();
  }

  private native void SetGenerateVertexPedigreeIds_16(boolean id0);
  public void SetGenerateVertexPedigreeIds(boolean id0)
  {
    SetGenerateVertexPedigreeIds_16(id0);
  }

  private native boolean GetGenerateVertexPedigreeIds_17();
  public boolean GetGenerateVertexPedigreeIds()
  {
    return GetGenerateVertexPedigreeIds_17();
  }

  private native void GenerateVertexPedigreeIdsOn_18();
  public void GenerateVertexPedigreeIdsOn()
  {
    GenerateVertexPedigreeIdsOn_18();
  }

  private native void GenerateVertexPedigreeIdsOff_19();
  public void GenerateVertexPedigreeIdsOff()
  {
    GenerateVertexPedigreeIdsOff_19();
  }

  private native boolean GetMaskArrays_20();
  public boolean GetMaskArrays()
  {
    return GetMaskArrays_20();
  }

  private native void SetMaskArrays_21(boolean id0);
  public void SetMaskArrays(boolean id0)
  {
    SetMaskArrays_21(id0);
  }

  private native void MaskArraysOn_22();
  public void MaskArraysOn()
  {
    MaskArraysOn_22();
  }

  private native void MaskArraysOff_23();
  public void MaskArraysOff()
  {
    MaskArraysOff_23();
  }

  private native boolean GetReadCharData_24();
  public boolean GetReadCharData()
  {
    return GetReadCharData_24();
  }

  private native void SetReadCharData_25(boolean id0);
  public void SetReadCharData(boolean id0)
  {
    SetReadCharData_25(id0);
  }

  private native void ReadCharDataOn_26();
  public void ReadCharDataOn()
  {
    ReadCharDataOn_26();
  }

  private native void ReadCharDataOff_27();
  public void ReadCharDataOff()
  {
    ReadCharDataOff_27();
  }

  private native boolean GetReadTagName_28();
  public boolean GetReadTagName()
  {
    return GetReadTagName_28();
  }

  private native void SetReadTagName_29(boolean id0);
  public void SetReadTagName(boolean id0)
  {
    SetReadTagName_29(id0);
  }

  private native void ReadTagNameOn_30();
  public void ReadTagNameOn()
  {
    ReadTagNameOn_30();
  }

  private native void ReadTagNameOff_31();
  public void ReadTagNameOff()
  {
    ReadTagNameOff_31();
  }

  public vtkXMLTreeReader() { super(); }

  public vtkXMLTreeReader(long id) { super(id); }
  public native long   VTKInit();

}
