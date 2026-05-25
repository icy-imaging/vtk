// java wrapper for vtkDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataReader extends vtkSimpleReader
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

  private native byte[] GetFileName_6(int id0);
  public String GetFileName(int id0)
  {
    return new String(GetFileName_6(id0), StandardCharsets.UTF_8);
  }

  private native int GetFileVersion_7();
  public int GetFileVersion()
  {
    return GetFileVersion_7();
  }

  private native int GetFileMajorVersion_8();
  public int GetFileMajorVersion()
  {
    return GetFileMajorVersion_8();
  }

  private native int GetFileMinorVersion_9();
  public int GetFileMinorVersion()
  {
    return GetFileMinorVersion_9();
  }

  private native int IsFileValid_10(byte[] id0, int len0);
  public int IsFileValid(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsFileValid_10(bytes0, bytes0.length);
  }

  private native int IsFileStructuredPoints_11();
  public int IsFileStructuredPoints()
  {
    return IsFileStructuredPoints_11();
  }

  private native int IsFilePolyData_12();
  public int IsFilePolyData()
  {
    return IsFilePolyData_12();
  }

  private native int IsFileStructuredGrid_13();
  public int IsFileStructuredGrid()
  {
    return IsFileStructuredGrid_13();
  }

  private native int IsFileUnstructuredGrid_14();
  public int IsFileUnstructuredGrid()
  {
    return IsFileUnstructuredGrid_14();
  }

  private native int IsFileRectilinearGrid_15();
  public int IsFileRectilinearGrid()
  {
    return IsFileRectilinearGrid_15();
  }

  private native void SetInputString_16(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_16(bytes0, bytes0.length);
  }

  private native byte[] GetInputString_17();
  public String GetInputString()
  {
    return new String(GetInputString_17(), StandardCharsets.UTF_8);
  }

  private native void SetInputString_18(byte[] id0, int len0,int id1);
  public void SetInputString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_18(bytes0, bytes0.length,id1);
  }

  private native int GetInputStringLength_19();
  public int GetInputStringLength()
  {
    return GetInputStringLength_19();
  }

  private native void SetBinaryInputString_20(byte id0[],int id1);

  public void SetBinaryInputString(byte id0[],int id1)
    { SetBinaryInputString_20(id0,id1); }

  private native void SetInputArray_21(vtkCharArray id0);
  public void SetInputArray(vtkCharArray id0)
  {
    SetInputArray_21(id0);
  }

  private native long GetInputArray_22();
  public vtkCharArray GetInputArray()
  {
    long temp = GetInputArray_22();

    if (temp == 0) return null;
    return (vtkCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetHeader_23();
  public String GetHeader()
  {
    return new String(GetHeader_23(), StandardCharsets.UTF_8);
  }

  private native void SetReadFromInputString_24(int id0);
  public void SetReadFromInputString(int id0)
  {
    SetReadFromInputString_24(id0);
  }

  private native int GetReadFromInputString_25();
  public int GetReadFromInputString()
  {
    return GetReadFromInputString_25();
  }

  private native void ReadFromInputStringOn_26();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_26();
  }

  private native void ReadFromInputStringOff_27();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_27();
  }

  private native int GetFileType_28();
  public int GetFileType()
  {
    return GetFileType_28();
  }

  private native int GetNumberOfScalarsInFile_29();
  public int GetNumberOfScalarsInFile()
  {
    return GetNumberOfScalarsInFile_29();
  }

  private native int GetNumberOfVectorsInFile_30();
  public int GetNumberOfVectorsInFile()
  {
    return GetNumberOfVectorsInFile_30();
  }

  private native int GetNumberOfTensorsInFile_31();
  public int GetNumberOfTensorsInFile()
  {
    return GetNumberOfTensorsInFile_31();
  }

  private native int GetNumberOfNormalsInFile_32();
  public int GetNumberOfNormalsInFile()
  {
    return GetNumberOfNormalsInFile_32();
  }

  private native int GetNumberOfTCoordsInFile_33();
  public int GetNumberOfTCoordsInFile()
  {
    return GetNumberOfTCoordsInFile_33();
  }

  private native int GetNumberOfFieldDataInFile_34();
  public int GetNumberOfFieldDataInFile()
  {
    return GetNumberOfFieldDataInFile_34();
  }

  private native byte[] GetScalarsNameInFile_35(int id0);
  public String GetScalarsNameInFile(int id0)
  {
    return new String(GetScalarsNameInFile_35(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetVectorsNameInFile_36(int id0);
  public String GetVectorsNameInFile(int id0)
  {
    return new String(GetVectorsNameInFile_36(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetTensorsNameInFile_37(int id0);
  public String GetTensorsNameInFile(int id0)
  {
    return new String(GetTensorsNameInFile_37(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetNormalsNameInFile_38(int id0);
  public String GetNormalsNameInFile(int id0)
  {
    return new String(GetNormalsNameInFile_38(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetTCoordsNameInFile_39(int id0);
  public String GetTCoordsNameInFile(int id0)
  {
    return new String(GetTCoordsNameInFile_39(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetFieldDataNameInFile_40(int id0);
  public String GetFieldDataNameInFile(int id0)
  {
    return new String(GetFieldDataNameInFile_40(id0), StandardCharsets.UTF_8);
  }

  private native void SetScalarsName_41(byte[] id0, int len0);
  public void SetScalarsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarsName_41(bytes0, bytes0.length);
  }

  private native byte[] GetScalarsName_42();
  public String GetScalarsName()
  {
    return new String(GetScalarsName_42(), StandardCharsets.UTF_8);
  }

  private native void SetVectorsName_43(byte[] id0, int len0);
  public void SetVectorsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVectorsName_43(bytes0, bytes0.length);
  }

  private native byte[] GetVectorsName_44();
  public String GetVectorsName()
  {
    return new String(GetVectorsName_44(), StandardCharsets.UTF_8);
  }

  private native void SetTensorsName_45(byte[] id0, int len0);
  public void SetTensorsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTensorsName_45(bytes0, bytes0.length);
  }

  private native byte[] GetTensorsName_46();
  public String GetTensorsName()
  {
    return new String(GetTensorsName_46(), StandardCharsets.UTF_8);
  }

  private native void SetNormalsName_47(byte[] id0, int len0);
  public void SetNormalsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNormalsName_47(bytes0, bytes0.length);
  }

  private native byte[] GetNormalsName_48();
  public String GetNormalsName()
  {
    return new String(GetNormalsName_48(), StandardCharsets.UTF_8);
  }

  private native void SetTCoordsName_49(byte[] id0, int len0);
  public void SetTCoordsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTCoordsName_49(bytes0, bytes0.length);
  }

  private native byte[] GetTCoordsName_50();
  public String GetTCoordsName()
  {
    return new String(GetTCoordsName_50(), StandardCharsets.UTF_8);
  }

  private native void SetLookupTableName_51(byte[] id0, int len0);
  public void SetLookupTableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLookupTableName_51(bytes0, bytes0.length);
  }

  private native byte[] GetLookupTableName_52();
  public String GetLookupTableName()
  {
    return new String(GetLookupTableName_52(), StandardCharsets.UTF_8);
  }

  private native void SetFieldDataName_53(byte[] id0, int len0);
  public void SetFieldDataName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDataName_53(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDataName_54();
  public String GetFieldDataName()
  {
    return new String(GetFieldDataName_54(), StandardCharsets.UTF_8);
  }

  private native void SetReadAllScalars_55(int id0);
  public void SetReadAllScalars(int id0)
  {
    SetReadAllScalars_55(id0);
  }

  private native int GetReadAllScalars_56();
  public int GetReadAllScalars()
  {
    return GetReadAllScalars_56();
  }

  private native void ReadAllScalarsOn_57();
  public void ReadAllScalarsOn()
  {
    ReadAllScalarsOn_57();
  }

  private native void ReadAllScalarsOff_58();
  public void ReadAllScalarsOff()
  {
    ReadAllScalarsOff_58();
  }

  private native void SetReadAllVectors_59(int id0);
  public void SetReadAllVectors(int id0)
  {
    SetReadAllVectors_59(id0);
  }

  private native int GetReadAllVectors_60();
  public int GetReadAllVectors()
  {
    return GetReadAllVectors_60();
  }

  private native void ReadAllVectorsOn_61();
  public void ReadAllVectorsOn()
  {
    ReadAllVectorsOn_61();
  }

  private native void ReadAllVectorsOff_62();
  public void ReadAllVectorsOff()
  {
    ReadAllVectorsOff_62();
  }

  private native void SetReadAllNormals_63(int id0);
  public void SetReadAllNormals(int id0)
  {
    SetReadAllNormals_63(id0);
  }

  private native int GetReadAllNormals_64();
  public int GetReadAllNormals()
  {
    return GetReadAllNormals_64();
  }

  private native void ReadAllNormalsOn_65();
  public void ReadAllNormalsOn()
  {
    ReadAllNormalsOn_65();
  }

  private native void ReadAllNormalsOff_66();
  public void ReadAllNormalsOff()
  {
    ReadAllNormalsOff_66();
  }

  private native void SetReadAllTensors_67(int id0);
  public void SetReadAllTensors(int id0)
  {
    SetReadAllTensors_67(id0);
  }

  private native int GetReadAllTensors_68();
  public int GetReadAllTensors()
  {
    return GetReadAllTensors_68();
  }

  private native void ReadAllTensorsOn_69();
  public void ReadAllTensorsOn()
  {
    ReadAllTensorsOn_69();
  }

  private native void ReadAllTensorsOff_70();
  public void ReadAllTensorsOff()
  {
    ReadAllTensorsOff_70();
  }

  private native void SetReadAllColorScalars_71(int id0);
  public void SetReadAllColorScalars(int id0)
  {
    SetReadAllColorScalars_71(id0);
  }

  private native int GetReadAllColorScalars_72();
  public int GetReadAllColorScalars()
  {
    return GetReadAllColorScalars_72();
  }

  private native void ReadAllColorScalarsOn_73();
  public void ReadAllColorScalarsOn()
  {
    ReadAllColorScalarsOn_73();
  }

  private native void ReadAllColorScalarsOff_74();
  public void ReadAllColorScalarsOff()
  {
    ReadAllColorScalarsOff_74();
  }

  private native void SetReadAllTCoords_75(int id0);
  public void SetReadAllTCoords(int id0)
  {
    SetReadAllTCoords_75(id0);
  }

  private native int GetReadAllTCoords_76();
  public int GetReadAllTCoords()
  {
    return GetReadAllTCoords_76();
  }

  private native void ReadAllTCoordsOn_77();
  public void ReadAllTCoordsOn()
  {
    ReadAllTCoordsOn_77();
  }

  private native void ReadAllTCoordsOff_78();
  public void ReadAllTCoordsOff()
  {
    ReadAllTCoordsOff_78();
  }

  private native void SetReadAllFields_79(int id0);
  public void SetReadAllFields(int id0)
  {
    SetReadAllFields_79(id0);
  }

  private native int GetReadAllFields_80();
  public int GetReadAllFields()
  {
    return GetReadAllFields_80();
  }

  private native void ReadAllFieldsOn_81();
  public void ReadAllFieldsOn()
  {
    ReadAllFieldsOn_81();
  }

  private native void ReadAllFieldsOff_82();
  public void ReadAllFieldsOff()
  {
    ReadAllFieldsOff_82();
  }

  private native int OpenVTKFile_83(byte[] id0, int len0);
  public int OpenVTKFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return OpenVTKFile_83(bytes0, bytes0.length);
  }

  private native int ReadHeader_84(byte[] id0, int len0);
  public int ReadHeader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadHeader_84(bytes0, bytes0.length);
  }

  private native int ReadCellData_85(vtkDataSet id0,long id1);
  public int ReadCellData(vtkDataSet id0,long id1)
  {
    return ReadCellData_85(id0,id1);
  }

  private native int ReadPointData_86(vtkDataSet id0,long id1);
  public int ReadPointData(vtkDataSet id0,long id1)
  {
    return ReadPointData_86(id0,id1);
  }

  private native int ReadPointCoordinates_87(vtkPointSet id0,long id1);
  public int ReadPointCoordinates(vtkPointSet id0,long id1)
  {
    return ReadPointCoordinates_87(id0,id1);
  }

  private native int ReadPointCoordinates_88(vtkGraph id0,long id1);
  public int ReadPointCoordinates(vtkGraph id0,long id1)
  {
    return ReadPointCoordinates_88(id0,id1);
  }

  private native int ReadVertexData_89(vtkGraph id0,long id1);
  public int ReadVertexData(vtkGraph id0,long id1)
  {
    return ReadVertexData_89(id0,id1);
  }

  private native int ReadEdgeData_90(vtkGraph id0,long id1);
  public int ReadEdgeData(vtkGraph id0,long id1)
  {
    return ReadEdgeData_90(id0,id1);
  }

  private native int ReadRowData_91(vtkTable id0,long id1);
  public int ReadRowData(vtkTable id0,long id1)
  {
    return ReadRowData_91(id0,id1);
  }

  private native int ReadCoordinates_92(vtkRectilinearGrid id0,int id1,int id2);
  public int ReadCoordinates(vtkRectilinearGrid id0,int id1,int id2)
  {
    return ReadCoordinates_92(id0,id1,id2);
  }

  private native long ReadArray_93(byte[] id0, int len0,long id1,long id2);
  public vtkAbstractArray ReadArray(String id0,long id1,long id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = ReadArray_93(bytes0, bytes0.length,id1,id2);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ReadFieldData_94(int id0);
  public vtkFieldData ReadFieldData(int id0)
  {
    long temp = ReadFieldData_94(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Read_95(byte[] id0, int len0);
  public int Read(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Read_95(bytes0, bytes0.length);
  }

  private native void CloseVTKFile_96();
  public void CloseVTKFile()
  {
    CloseVTKFile_96();
  }

  private native int ReadLine_97(byte[] id0, int len0);
  public int ReadLine(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadLine_97(bytes0, bytes0.length);
  }

  private native int ReadTimeDependentMetaData_98(int id0,vtkInformation id1);
  public int ReadTimeDependentMetaData(int id0,vtkInformation id1)
  {
    return ReadTimeDependentMetaData_98(id0,id1);
  }

  private native int ReadMesh_99(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_99(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_100(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_100(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_101(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_101(id0,id1,id2,id3,id4);
  }

  private native int ReadMeshSimple_102(byte[] id0, int len0,vtkDataObject id1);
  public int ReadMeshSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMeshSimple_102(bytes0, bytes0.length,id1);
  }

  private native int ReadPointsSimple_103(byte[] id0, int len0,vtkDataObject id1);
  public int ReadPointsSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadPointsSimple_103(bytes0, bytes0.length,id1);
  }

  private native int ReadArraysSimple_104(byte[] id0, int len0,vtkDataObject id1);
  public int ReadArraysSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadArraysSimple_104(bytes0, bytes0.length,id1);
  }

  public vtkDataReader() { super(); }

  public vtkDataReader(long id) { super(id); }
  public native long   VTKInit();

}
